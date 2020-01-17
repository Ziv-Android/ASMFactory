package com.ziv.demo.asmfactory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Server静态方法自定义注解
 *
 * @author ziv
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface StaticFunction {
}
