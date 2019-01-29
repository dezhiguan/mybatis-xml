package com.gdz.mybatisxml;


import com.gdz.mybatisxml.entity.User;
import com.gdz.mybatisxml.mapper.UserMapper;

/**
 * @Author: guandezhi
 * @Date: 2019/1/29 10:51
 */
public class Main {


    public static void main(String[] args) {
        String path = "mapper/UserMapper.xml";

        UserMapper userMapper = SqlSession.getUserMapper(UserMapper.class,  path);
        User user = userMapper.queryUser("官德志");
        System.out.println(user);
    }

}
