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


    public String getServiceException() {
        int i = 1 / 0;
        String user = "我是service层异常!";
        return user;
    }

    public String customException() {

        //这个操作会报 系统异常
        // int i=1/0;
        // return "我是模拟数据库查询出来的user";
        //这个操作会报 自定义的异常
        throw new MyException("模拟自定义异常(数据库操作)");
    }

}
