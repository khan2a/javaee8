package com.mysamples.javaee8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpringBootResource1 {
    @Autowired
    private MySpringBootResource2 res2;

    public void helloResource1() {
        System.out.println("Calling Resource 1");
        res2.helloResource2();

    }
}
