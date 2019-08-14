package com.example.globalexception.api;

import com.example.globalexception.result.ResultData;
import com.example.globalexception.result.ResultVO;
import com.example.globalexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
     * 正常返回
     */
    @RequestMapping("/test")
    public ResultVO exception() {
        System.out.println("正常返回");
        String user = "假装我是个user";
        return ResultData.success("查询成功!", user);

    }

    /**
     * 模拟controller异常
     */
    @GetMapping("/test1")
    public ResultVO exception1() {
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
        //service抛出异常
        String user = null;

        //1 手动try那么可用获取异常真实信息,  优点是方便找到异常信息
        // try {
        //     user = userService.getServiceException();
        //     return ResultData.success("查询成功!", user);
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     return ResultData.error(e.getMessage());
        // }

        //    2 不try那么直接处理为最外层异常,  优点是代码可用很简洁
        user = userService.getServiceException();
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

    // api借口路径错误,或者与参数不对应,这种为了友好也应该捕获

//    {
//     "timestamp": "2019-08-14T06:15:22.022+0000",
//     "status": 404,
//     "error": "Not Found",
//     "message": "No message available",
//     "path": "/api/user/test22"
// }


}
