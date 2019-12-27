package com.wangzhan.springboot.interfaceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterInterfaceptor  implements HandlerInterceptor {

    int num = 0;
    /*在进入controller之前会执行这个方法*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        num++;
        System.out.println("已经进入了  注册  的拦截器。。。。。。。第" + num +"次");

        //逻辑代码按照之前的方式去编写即可

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
