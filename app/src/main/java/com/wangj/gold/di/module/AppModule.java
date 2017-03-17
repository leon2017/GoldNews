package com.wangj.gold.di.module;

import com.wangj.gold.config.GoldApp;
import com.wangj.gold.di.ContextLife;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 当前类注释：app module
 * <p>
 * Author :LeonWang
 * <p>
 * Created  2017/3/17.16:21
 * <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

@Module
public class AppModule {

    private final GoldApp application;

    public AppModule(GoldApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    GoldApp provideApplicationContext() {
        return application;
    }
}
