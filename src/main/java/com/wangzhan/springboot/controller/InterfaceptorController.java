package com.wangzhan.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/*
* 该controller类是为了验证拦截器的效果
* */
@Controller
public class InterfaceptorController {

/*登录的访问路径——start*/
    @RequestMapping("/Login/interfaceptor1")
    public @ResponseBody String interfaceptor1 () {
        return "Hello, welcome to Login interfaceptor1.";
    }

    @RequestMapping("/Login/interfaceptor2")
    public @ResponseBody String interfaceptor2 () {
        return "Hello, welcome to Login interfaceptor2.";
    }


    @RequestMapping("/Login/interfaceptor3")
    public @ResponseBody String interfaceptor3 () {
        return "Hello, welcome to Login interfaceptor3.";
    }

    @RequestMapping("/Login/interfaceptor4")
    public @ResponseBody String interfaceptor4 () {
        return "Hello, welcome to Login interfaceptor4.";
    }
/*登录的访问路径——end*/



/*注册的访问路径——start*/
    @RequestMapping("/Register/interfaceptor5")
    public @ResponseBody String interfaceptor5 () {
        return "Hello, welcome to Register interfaceptor5.";
    }

    @RequestMapping("/Register/interfaceptor6")
    public @ResponseBody String interfaceptor6 () {
        return "Hello, welcome to Register interfaceptor6.";
    }


    @RequestMapping("/Register/interfaceptor7")
    public @ResponseBody String interfaceptor7 () {
        return "Hello, welcome to Register interfaceptor7.";
    }

    @RequestMapping("/Register/interfaceptor8")
    public @ResponseBody String interfaceptor8 () {
        return "Hello, welcome to Register interfaceptor8.";
    }
/*注册的访问路径——end*/



}
