package com.jt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;
import jakarta.annotation.PostConstruct;

@Component
public class greet {
    private greeting greeting;

    public greet(){
        System.out.println("Greet object is constructed");
    }
    @Autowired
    public void setgreeting(greeting greeting){
        System.out.println("greeting object is injected");
        this.greeting=greeting;
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is Initialized");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Greet bean is destoyed");
    }

    public void greet() {
        System.out.println("Hello everyone");
        // greeting.sayHii();
    }
}
