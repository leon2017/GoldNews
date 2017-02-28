package com.wangj.gold.utils.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wangj.gold.R;
import com.wangj.gold.config.GoldApp;


/**
 * Created by leonWang on 2017/1/10.
 */

public class GlideImageLoader extends BaseImageLoader {

    private static GlideImageLoader instance;

    public static GlideImageLoader getInstance() {
        if (instance == null) {
            instance = new GlideImageLoader();
        }
        return instance;
    }


    /**
     * 加载普通图片
     *
     * @param context
     * @param path
     * @param imageView
     */
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(context)
                .load(path)//路径
                .crossFade()//平滑动画
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存
                .centerCrop()//填充方式--完全
                .placeholder(R.mipmap.entry_image_default)//加载中默认图
                .error(R.mipmap.entry_image_default)//失败图
                .into(imageView);//view
    }

    /**
     * 加载普通图片
     *
     * @param path
     * @param imageView
     */
    @Override
    public void displayImage(Object path, ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(GoldApp.getInstance().getApplicationContext())
                .load(path)//路径
                .crossFade()//平滑动画
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存
                .centerCrop()//填充方式--完全
                .placeholder(R.mipmap.entry_image_default)//加载中默认图
                .error(R.mipmap.entry_image_default)//失败图
                .into(imageView);//view
    }

}
