package com.wangj.gold.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * 当前类注释：掘金列表的数据baseBean
 * Author :LeonWang
 * Created  2017/2/28.14:43
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class BaseGoldEntity<T> {

    /**
     * code and error is params for request error
     */
    private int code;
    private String error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /****************请求成功******************/
    @SerializedName("results")
    private T results;

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }


}
