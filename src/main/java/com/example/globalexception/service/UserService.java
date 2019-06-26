package com.example.globalexception.service;

import com.example.globalexception.exception.MyException;
import org.springframework.stereotype.Service;

/**
 * Uservice:模拟用户实现类
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/26
 */
@Service
public class UserService {

    public String getUser() {

        //return "我是模拟数据库查询出来的user";
        throw new MyException("模拟自定义异常(数据库操作)");
    }

}
