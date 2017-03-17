package com.wangj.gold.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang
 * <p>
 * Created  2017/3/17.16:32
 * <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */
@Scope
@Retention(RUNTIME)
public @interface FragmentScope {
}
