package com.example.mall;

import com.example.mall.util.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
//@EnableCaching
public class Application {
   // static {
    //    PortUtil.checkPort(6379,"Redis 服务端",true);//项目启动时就初始化，所以用静态代码块
   // }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);    
    }
}