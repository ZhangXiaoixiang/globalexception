package com.example.globalexception.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestPageCtr:
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/26
 */
@Controller
@RequestMapping("/page")
public class TestPageCtr {
    @RequestMapping("/index")
    public Object goIndex() {
        return "index";
    }


}
