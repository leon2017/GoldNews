package com.wangj.gold.base;

/**
 * 当前类注释：base view
 * Author :LeonWang
 * Created  2017/2/28.13:40
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public interface BaseView {

    void showLoading(String title);
    void stopLoading();
    void showError(String msg);
}
