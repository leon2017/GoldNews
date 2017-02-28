package com.wangj.gold.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * 当前类注释：基于RX的presenter封装，控制订阅的生命周期
 * Author :LeonWang
 * Created  2017/2/28.13:55
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class RxPresenter<T extends BaseView> implements BasePresenter<T> {

    protected T mView;
    protected CompositeSubscription mCompositeSubscription;

    protected void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
    }

    protected void addSubscribe(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
        unSubscribe();
    }
}
