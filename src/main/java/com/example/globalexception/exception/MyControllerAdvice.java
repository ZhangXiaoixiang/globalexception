package com.example.globalexception.exception;

import com.example.globalexception.result.ResultData;
import com.example.globalexception.result.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MyControllerAdvice:全局异常
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/25
 */
 @ControllerAdvice  //不指定包默认加了@Controller和@RestController都能控制
// @ControllerAdvice(basePackages ="com.example.demo.controller")
public class MyControllerAdvice {
    /**
     * 全局异常处理，反正异常返回统一格式的  ---接口路径正确,但是入参或者服务器响应异常的全局处理
     * 发生异常进行日志记录，写入数据库或者其他处理，此处省略  ---开发阶段可用不用拦截,这样方便看到异常详情
     *
     * @param exception
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultVO exceptionHandler(Exception exception) {
        return ResultData.error("系统故障");
    }


    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public ResultVO myExceptionHandler(MyException e) {
        return ResultData.error(e.getMessage());
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
    }

}
