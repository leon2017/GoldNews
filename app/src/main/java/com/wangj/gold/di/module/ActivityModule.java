package com.wangj.gold.di.module;

import android.app.Activity;

import com.wangj.gold.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * 当前类注释：ActivityModule
 * <p>
 * Author :LeonWang
 * <p>
 * Created  2017/3/17.16:34
 * <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
