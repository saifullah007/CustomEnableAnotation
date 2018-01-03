package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author saifullah on 3/1/18.
 */
@Component
public class AutowireTest {

    @Autowired
    private String aBean1;

    @Autowired
    private String aBean2;


    @PostConstruct
    private void postConstruct(){
        System.out.println(">>>>>>> "+aBean1+" <<<<<<< "+aBean2);
    }
}
