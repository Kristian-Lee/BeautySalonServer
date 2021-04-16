//package com.example.beautysalon.filter;
//
//import com.alibaba.druid.sql.visitor.functions.Char;
//import com.example.beautysalon.service.RedisService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//
//import javax.annotation.Resource;
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @Author Lee
// * @Date 2021.3.16
// * @Description
// */
//
//@Configuration
//public class LoginHandlerInterceptor implements HandlerInterceptor {
//
//    private RedisService redisService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        WebApplicationContext wctx = (WebApplicationContext) request.getSession().getServletContext()
//                .getAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcherServlet");
//
//        redisService = wctx.getBean(RedisService.class);
//
//        String user = request.getHeader("token");
//        System.out.println(user);
//        System.out.println(redisService);
//        return redisService.exist(user);
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
