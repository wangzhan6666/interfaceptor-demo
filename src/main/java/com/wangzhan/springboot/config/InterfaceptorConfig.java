package com.wangzhan.springboot.config;


import com.wangzhan.springboot.interfaceptor.LoginInterfaceptor;
import com.wangzhan.springboot.interfaceptor.RegisterInterfaceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//拦截器(PS:拦截器的包名：interfaceptor)的配置类
@Configuration     //@Configuration注解标注此类为一个配置类，让springboot扫描到
public class InterfaceptorConfig extends WebMvcConfigurationSupport/*WebMvcConfigurerAdapter*/ {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

/*Login的是否拦截配置——start*/
        //Login需要拦截的路径
        String[] addPathPatternsByLogin = {
                "/Login/**"
        };

        //Login不需要拦截的路径
        String[] excludePathPathernsByLogin = {
                "/Login/interfaceptor1",
                "/Login/interfaceptor2"
        };//不拦截interfaceptor1,interfaceptor2
/*Login的是否拦截配置——end*/

/*Register的是否拦截配置——start*/
        //Register需要拦截的路径
        String[] addPathPatternsByRegister = {
                "/Register/**"
        };

        //Login不需要拦截的路径
        String[] excludePathPathernsByRegister = {
                "/Register/interfaceptor7",
                "/Register/interfaceptor8"
        };//不拦截interfaceptor7,interfaceptor8
/*Register的是否拦截配置——end*/

        //登录拦截器
        registry.addInterceptor(new LoginInterfaceptor()).addPathPatterns(addPathPatternsByLogin).excludePathPatterns(excludePathPathernsByLogin);

        //注册拦截器
        registry.addInterceptor(new RegisterInterfaceptor()).addPathPatterns(addPathPatternsByRegister).excludePathPatterns(excludePathPathernsByRegister);

    }
}
