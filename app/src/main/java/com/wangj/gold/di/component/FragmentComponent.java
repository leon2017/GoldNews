package com.wangj.gold.di.component;

import android.app.Activity;

import com.wangj.gold.di.FragmentScope;
import com.wangj.gold.di.module.FragmentModule;

import dagger.Component;

/**
 * 当前类注释：FragmentComponent
 * <p>
 * Author :LeonWang <p>
 * Created  2017/3/17.17:04 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */
@FragmentScope
@Component(dependencies = AppComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();
}
