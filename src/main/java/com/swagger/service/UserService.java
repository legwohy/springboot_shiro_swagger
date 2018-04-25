package com.swagger.service;

import com.swagger.dao.UserDao;
import com.swagger.entirty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * 用户业务类
 * springBoot jdbcTemplate数据库
 */
//@Service
public class UserService {

    //@Autowired
    private JdbcTemplate jdbcTemplate;// spring自带的jdbc模板
    @Autowired private UserDao userDao;

    /**
     * 查询所有的用户
     */
    public List<HashMap<String,Object>> getList1(){
        String sql = "select *from user";
        return jdbcTemplate.query(sql, new RowMapper<HashMap<String, Object>>() {
            @Override
            public HashMap<String, Object> mapRow(ResultSet rs, int i) throws SQLException {
                HashMap<String,Object> map = new HashMap<String, Object>();
                map.put("id",rs.getInt("id"));
                map.put("name",rs.getString("name"));
                map.put("pwd",rs.getString("pwd"));
                map.put("gender",rs.getString("gender"));
                map.put("realname",rs.getString("realname"));
                map.put("address",rs.getString("address"));
                map.put("age",rs.getInt("age"));

                return map;
            }
        });
    }

    /**
     * 返回hash
     * @return
     */
    public List<HashMap<String,Object>> getListH(){
       return  userDao.findUserH();
    }
    public HashMap<String,Object> findUserByIdH(HashMap<String,Object> params){
        return userDao.findUserByIdH(params);
    }

    /**
     * 查询所有的用户
     */
    public List<User> findUsers(){
        return  userDao.findUser();
    }

    /**
     * 通过主键查询用户
     */
    public User findUserById(int  id){
        return userDao.findUserById(id);
    }

    public User findUserByPhone(String userPhone){
        return userDao.findUserByPhone(userPhone);
    }


    /**
     * 删除用户
     */
    public boolean deleteUser(int id){
        return userDao.deleteUser(id) > 0;
    }

    /**
     * 跟新用户
     */
    public boolean updateUser(User user){
        return userDao.updateUser(user) > 0;
    }
    public boolean updateUserH(HashMap<String,Object> params){
        return userDao.updateUserH(params) > 0;
    }

    /**
     * 注册用户
     */
    public boolean insertUser(User user){
        return userDao.insertUser(user) > 0;
    }

}
