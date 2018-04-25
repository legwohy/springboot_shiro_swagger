package com.shiro.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * 密码校验
 * Credentials 凭证
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    /**
     *
     * credentials证明/凭证，即只有主体知道的安全值，如密码/数字证书
     * 密码比对
     * @param token
     * @param info
     * @return
     */
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 登陆时传过来的

        //获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
        String inpassword = new String(utoken.getPassword());// 密码为数组

        // 获取数据库的密码
        String dbpassword = (String) info.getCredentials();


        return this.equals(inpassword,dbpassword);// 密码比对
    }
}
