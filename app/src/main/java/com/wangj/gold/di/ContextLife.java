package com.wangj.gold.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang
 * <p>
 * Created  2017/3/17.16:27
 * <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface ContextLife {
    String value() default "Application";
}
