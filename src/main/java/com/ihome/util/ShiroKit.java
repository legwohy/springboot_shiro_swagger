package com.ihome.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * shiro 工具类
 */
public class ShiroKit {
    public static String md5Pwd(String password,String salt){
        String md5Pwd = new Md5Hash(password, salt).toHex();
        return md5Pwd;
    }
}
