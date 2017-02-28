package com.wangj.gold.base;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

/**
 * 当前类注释：base activity
 * Author :LeonWang
 * Created  2017/2/28.14:24
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public abstract class BaseActivity<T extends BasePresenter>
        extends RxAppCompatActivity implements BaseView {

}
