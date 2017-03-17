package com.wangj.gold.di.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.wangj.gold.di.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * 当前类注释：FragmentModule
 * <p>
 * Author :LeonWang
 * <p>
 * Created  2017/3/17.16:47
 * <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

@Module
public class FragmentModule {

    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return mFragment.getActivity();
    }
}
