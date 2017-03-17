package com.wangj.gold.base;

/**
 * 当前类注释：base presenter
 * Author :LeonWang
 * Created  2017/2/28.13:39
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public interface BasePresenter<T extends BaseView>{

    /**
     * 与View层建立关联
     * @param view
     */
    void attachView(T view);

    /**
     * 解除关联
     */
    void detachView();
}
