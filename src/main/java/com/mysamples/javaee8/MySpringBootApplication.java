package com.mysamples.javaee8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringBootApplication.class, args);
        MySpringBootResource1 res1 = context.getBean(MySpringBootResource1.class);
        res1.helloResource1();
    }
}
