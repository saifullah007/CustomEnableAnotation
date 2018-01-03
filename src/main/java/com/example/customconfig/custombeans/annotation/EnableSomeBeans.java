package com.example.customconfig.custombeans.annotation;

import com.example.customconfig.custombeans.SomeBeanConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author saifullah on 3/1/18.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(SomeBeanConfiguration.class)
public @interface EnableSomeBeans {
}
