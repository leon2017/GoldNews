package com.wangj.gold.base;

/**
 * 当前类注释：base presenter
 * Author :LeonWang
 * Created  2017/2/28.13:39
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public interface BasePresenter<T extends BaseView>{

    void attachView(T view);
    void detachView();
}
