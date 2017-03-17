package com.wangj.gold.di.component;

import com.wangj.gold.config.GoldApp;
import com.wangj.gold.di.ContextLife;
import com.wangj.gold.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang <p>
 * Created  2017/3/17.16:55 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    //context
    @ContextLife("Application")
    GoldApp getContext();
}
