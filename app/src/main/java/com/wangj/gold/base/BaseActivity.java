package com.wangj.gold.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.wangj.gold.utils.AppManager;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * 当前类注释：base activity
 * Author :LeonWang
 * Created  2017/2/28.14:24
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public abstract class BaseActivity<T extends BasePresenter>
        extends RxAppCompatActivity implements BaseView {

    @Inject
    protected T mPresenter;
    protected Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        mContext = this;
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        AppManager.getInstance().addActivity(this);
        initEvent();
    }

    protected abstract void initEvent();

    protected abstract void initInject();

    protected abstract int getLayout();

}
