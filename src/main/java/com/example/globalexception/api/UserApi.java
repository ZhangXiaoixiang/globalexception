package com.example.globalexception.api;

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
    /**
     * 模拟controller异常
     */
    @GetMapping("/test1")
    public ResultVO exception() {
        System.out.println("=====>controller异常");
        String user = "假装我是个user";
        int i = 1 / 0;
        return ResultData.success("查询成功!", user);

    }

    /**
     * 模拟service异常
     */
    @GetMapping("/test2")
    public ResultVO getServiceException() {
        System.out.println("=====>service异常");
        //service跑出异常
        String user = userService.getServiceException();
        return ResultData.success("查询成功!", user);

    }

    /**
     * 模拟自定义异常
     *
     * @return
     */
    @GetMapping("/test3")
    public ResultVO customException() {
        System.out.println("=====>service自定义异常");
        //service自定义异常
        String user1 = userService.customException();
        return ResultData.success("查询成功!", user1);

    }



}
