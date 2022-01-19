package com.soft.demo.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {

    public SpringBean2() {
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
