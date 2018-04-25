package com.ihome.config;

import com.ihome.service.UserService;
import com.ihome.util.ShiroKit;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ihome.pojo.UserInfo;

import java.util.Set;

/**
 * 验证用户登录
 * 
 * @author Administrator
 */
@Component("userRealm")
public class UserRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;


	/**
	 * 授权
	 * 当前用户是否具有调用当前接口的权限
	 * 角色和权限
	 * @param principals
	 * @return
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal();
		System.out.println("授权模块:"+username);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> set = userService.findPermissions(username);
		if(!set.isEmpty()){
			System.out.println("权限数量:"+set.size());
			// 添加权限
			info.setStringPermissions(set);
		}


		return info;
	}

	/**
	 * 认证 当前用户是否登录，是否为系统的合法用户
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		String username = (String)token.getPrincipal(); //得到用户名
		String password = new String((char[])token.getCredentials()); //得到密码

		if(!"jack".equals(username)) {
			throw new UnknownAccountException("登录名不正确，请重新输入!"); //如果用户名错误
		}
		if(!"123".equals(password)) {
			throw new IncorrectCredentialsException("登陆密码错误，请重新输入!"); //如果密码错误
		}

		//如果身份认证验证成功，返回一个 AuthenticationInfo 实现；
		return new SimpleAuthenticationInfo(
				username, // 用户
				password,// 密码
				getName());// realm name
	}
}