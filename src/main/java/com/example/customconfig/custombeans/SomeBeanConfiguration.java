package com.example.customconfig.custombeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author saifullah on 3/1/18.
 */
@Configuration
public class SomeBeanConfiguration {

    @Bean
    public String aBean1(){
        return "aBean1";
    }

    @Bean
    public String aBean2(){
        return "aBean2";
    }
}