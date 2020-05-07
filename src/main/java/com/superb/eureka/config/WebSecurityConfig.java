//package com.superbee.eureka.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
///**
// * @ClassName WebSecurityConfig
// * @Description TODO
// * @Author linxin
// * @Date 2019-12-04 17:38
// * @Version 1.0
// **/
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
//        httpSecurity.csrf().disable();
//        //注意：为了可以使用 http://${user}:${password}@${host}:${port}/eureka/ 这种方式登录,所以必须是httpBasic,
//        // 如果是form方式,不能使用url格式登录
//        httpSecurity.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
//}
