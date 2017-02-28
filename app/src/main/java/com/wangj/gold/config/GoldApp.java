package com.wangj.gold.config;

import android.app.Application;

import com.orhanobut.logger.BuildConfig;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * 当前类注释：application
 * Author :LeonWang
 * Created  2017/2/28.13:21
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class GoldApp extends Application {

    private static GoldApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Logger.init("Logger")//TAG标签
                .methodCount(0)//方法数量
                .hideThreadInfo()//隐藏线程信息
                .logLevel(BuildConfig.DEBUG ? LogLevel.FULL : LogLevel.NONE);//日志层级
    }

    public static synchronized GoldApp getInstance() {
        return instance;
    }
}
