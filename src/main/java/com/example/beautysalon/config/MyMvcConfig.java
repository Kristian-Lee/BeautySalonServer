//package com.example.beautysalon.config;
//
//import com.example.beautysalon.filter.LoginHandlerInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author Lee
// * @date  2021.3.16  21:22
// * @description
// */
//@Configuration
//public class MyMvcConfig implements WebMvcConfigurer {
//
//    public LoginHandlerInterceptor loginHandlerInterceptor(){
//        return new LoginHandlerInterceptor();
//    }
//
//    /**
//     *  拦截
//     * @return WebMvcConfigurer
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginHandlerInterceptor()).addPathPatterns("/**");
//    }
//}
