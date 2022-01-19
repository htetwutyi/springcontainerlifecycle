package com.soft.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {
    private SpringBean2 springBean2;
    private SpringBean3 springBean3;
    public SpringBean1(){
        System.out.println(getClass().getSimpleName());
    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        this.springBean2 = springBean2;
    }
    @Autowired
    public void setSpringBean3(SpringBean3 springBean3) {
        this.springBean3 = springBean3;
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
