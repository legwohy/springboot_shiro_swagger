package com.com.shiro.shiro;

import com.com.shiro.entirty.BackModule;
import com.com.shiro.entirty.BackRole;
import com.com.shiro.entirty.BackUser;
import com.com.shiro.service.BackUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 认证
 * 根据用户名去数据库的查询,并且将用户信息放入shiro中,供第二个类调用
 */
public class MyShiroRealm extends AuthorizingRealm {
    @Autowired private BackUserService userService;


    /**
     * 登陆检查
     * @param token 令牌 登陆信息

     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 获取用户插入的token
        String userName = utoken.getUsername();// 登录名
        BackUser user = userService.findUserByName(userName);// 调用用户

        return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());
    }

    /**
     * 权限校验
     *
     * 授权的方法是在碰到<shiro:hasPermission>标签的时候调用的,
     * 它会去检测shiro框架中的权限(这里的permissions)是否包含有该标签的name值,
     * 如果有,里面的内容显示,如果没有,里面的内容不予显示(这就完成了对于权限的认证.)
     *
     * @param principal 身份，即主体的标识属性
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        // 获取session中的用户 集合迭代
        BackUser user = (BackUser) principal.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissions = new ArrayList<String>();// 存取资源(权限)
        Set<BackRole> roleSet = user.getRoleSet();// 用户中取得资源(权限)
        if(roleSet.size() > 0){
            // 取资源(权限)
            for (BackRole role:roleSet){
                Set<BackModule> moduleSet = role.getModuleSet();// 角色中取资源(权限)
                for (BackModule module:moduleSet){
                    permissions.add(module.getModuleName());
                }
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);// 将资源（权限）放入shiro中
        return info;// 密码比对时需要校验
    }
}
