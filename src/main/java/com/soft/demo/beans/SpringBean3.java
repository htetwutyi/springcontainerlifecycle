package com.soft.demo.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean3 {
    public SpringBean3() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getSimpleName() + "::postConstruct");
    }

    @PreDestroy
    public void preDestory() {
        System.out.println(getClass().getSimpleName() + "::preDestory");
    }
}
