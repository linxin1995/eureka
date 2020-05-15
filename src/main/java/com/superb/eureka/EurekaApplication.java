package com.superb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        //MDC.put("mainReqId", UUID.randomUUID().toString().substring(0,8));
        SpringApplication.run(EurekaApplication.class, args);
    }

    // eureka 启动类


//    @EnableWebSecurity
//    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.csrf().ignoringAntMatchers("/eureka/**");
//            super.configure(http);
//        }
//    }

}

