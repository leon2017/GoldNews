package com.wangj.gold.http;

import com.orhanobut.logger.Logger;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.wangj.gold.entity.BaseGoldEntity;

import rx.Observable;
import rx.functions.Func1;

/**
 * 当前类注释：自定义http Transformer
 * Author :LeonWang
 * Created  2017/2/28.15:00
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class HttpTransformer<T> implements Observable.Transformer<BaseGoldEntity<T>,BaseGoldEntity<T>> {

    private final LifecycleTransformer<BaseGoldEntity<T>> mLifecycleTransformer;

    public HttpTransformer(LifecycleTransformer<BaseGoldEntity<T>> lifecycleTransformer) {
        mLifecycleTransformer = lifecycleTransformer;
    }

    @Override
    public Observable<BaseGoldEntity<T>> call(Observable<BaseGoldEntity<T>> observable) {
        return observable
                .map(new Func1<BaseGoldEntity<T>, BaseGoldEntity<T>>() {
                    @Override
                    public BaseGoldEntity<T> call(BaseGoldEntity<T> response) {
                        if (null == response.getResults()) {
                            throw new ApiException(response.getCode(),response.getError());
                        }
                        Logger.d("-----------HttpTransformer----------" + response.toString());
                        return response;
                    }
                })
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends BaseGoldEntity<T>>>() {
                    @Override
                    public Observable<? extends BaseGoldEntity<T>> call(Throwable throwable) {
                        throwable.printStackTrace();
                        return Observable.error(throwable);
                    }
                })
                .compose(mLifecycleTransformer);
    }
}
