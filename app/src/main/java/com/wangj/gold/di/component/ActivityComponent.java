package com.wangj.gold.di.component;

import android.app.Activity;

import com.wangj.gold.di.ActivityScope;
import com.wangj.gold.di.module.ActivityModule;

import dagger.Component;

/**
 * 当前类注释：统一Component
 * <p>
 * Author :LeonWang <p>
 * Created  2017/3/17.16:54 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();
}
