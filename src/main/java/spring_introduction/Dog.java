package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet{

//    @PostConstruct
//    private void init(){
//
//        System.out.println("Class Dog init method");
//    }
//    @PreDestroy
//    protected void destroy(){
//        System.out.println("Class Dog destroy method");
//    }


    Dog(){
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Dog says bow-bow");
    }




}
