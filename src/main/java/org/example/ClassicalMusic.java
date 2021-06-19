package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;


public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my init!");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy!");
    }

    public ClassicalMusic(){};

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
