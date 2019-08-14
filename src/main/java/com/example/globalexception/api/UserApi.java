package com.example.globalexception.api;

import com.example.globalexception.exception.MyException;
import com.example.globalexception.result.ResultData;
import com.example.globalexception.result.ResultVO;
import com.example.globalexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserApi:用户接口
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/25
 */
@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
    private UserService userService;

    @GetMapping("/get")

    /**
     * 模拟系统异常
     */
    public ResultVO getUser() {
        String user = "假装我是个user";
        int i = 1 / 0;
        return ResultData.success("查询成功!", user);

    }

    /**
     * 模拟自定义异常
     *
     * @return
     */
    @RequestMapping("/myexc")
    public ResultVO myexc() {
        //下面
        String user1 = userService.getUser();
        return ResultData.success("查询成功!", user1);

    }



}
