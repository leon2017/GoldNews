# 高仿掘金APP #
---

##1、 技术选型 ##

> 框架采用MVP模式+retrofit+rxjava  
> 主界面UI采用 bottomNavigation+fragment搭建  
> 接口数据来自网络抓包（如有侵权，请联系删除）

## 2、项目的主要依赖 ##

	compile "com.android.support:appcompat-v7:$supportVersion"
    compile "com.android.support:cardview-v7:$supportVersion"
    compile "com.android.support:recyclerview-v7:$supportVersion"
    compile "com.android.support:design:$supportVersion"
    compile "com.android.support:support-vector-drawable:$supportVersion"
    testCompile 'junit:junit:4.12'

    compile 'com.squareup.retrofit2:retrofit:2.0.2'
    compile 'com.squareup.okhttp3:logging-interceptor:3.1.2'
    compile 'com.squareup.retrofit2:converter-gson:2.0.2'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.0.2'
    compile 'com.squareup.retrofit2:converter-scalars:2.0.2'
    compile 'io.reactivex:rxandroid:1.1.0'
    compile 'io.reactivex:rxjava:1.1.0'
    compile 'com.jakewharton:butterknife:8.4.0'

    compile 'org.greenrobot:eventbus:3.0.0'
    compile 'com.google.dagger:dagger:2.4'
    apt 'com.google.dagger:dagger-compiler:2.4'
    //java注解
    compile 'org.glassfish:javax.annotation:10.0-b28'

    //bottomnavigation
    compile 'com.ashokvarma.android:bottom-navigation-bar:1.3.0'

    compile 'com.orhanobut:logger:1.15'

## 3、开发流程 ##

1. 主题设置：

>①、默认Valus下面  theme.xml文件的配置：  
>     <!-- Base application theme. -->
>     <style name="BaseTheme" parent="Theme.AppCompat.Light.NoActionBar">
>     <!-- Customize your theme here. -->
>     <item name="colorPrimary">@color/colorPrimary</item>
>     <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
>     <item name="colorAccent">@color/colorAccent</item>
>     <item name="colorButtonNormal">@color/colorAccent</item>
>     </style>
>     
>     <style name="AppTheme" parent="BaseTheme"/>
>     
>     <!--透明状态栏-->
>     <style name="AppTheme.TranslucentStatus"/>
>     
>     <!--splash页面  防止启动白屏-->
>     <style name="AppTheme.Splash">
>     <item name="android:windowBackground">@mipmap/img_splash_bg</item>
>     </style>
>     
>     <style name="AppTheme.PopupOverlay.White" parent="ThemeOverlay.AppCompat.Dark" />
>     <style name="AppTheme.AppBarOverlay.White" parent="ThemeOverlay.AppCompat.Light" />
>     
>     <!--白色(设置相关页面)-->
>     <style name="AppTheme.White"/></resources>
>② V19/Themes.xml

    <resources>

    <style name="AppTheme" parent="BaseTheme">
    <item name="android:windowTranslucentStatus">true</item>
    </style>
    
    <!--透明状态栏-->
    <style name="AppTheme.TranslucentStatus"/>
    
    <style name="AppTheme.Splash">
    <item name="android:windowBackground">@mipmap/img_splash_bg</item>
    </style>
    
    <!--白色  相关设置界面-->
    <style name="AppTheme.White">
    <item name="android:windowTranslucentStatus">false</item>
    </style>
    </resources>

>③V21/Themes.xml

	<?xml version="1.0" encoding="utf-8"?>
	<resources>

    <style name="AppTheme" parent="BaseTheme">
        <item name="android:statusBarColor">@color/colorPrimaryDark</item>
    </style>

    <style name="AppTheme.TranslucentStatus">
        <item name="android:windowDrawsSystemBarBackgrounds">true</item>
        <item name="android:windowTranslucentStatus">true</item>
    </style>

    <style name="AppTheme.White">
        <item name="colorPrimaryDark">@android:color/black</item>
        <item name="android:statusBarColor">@android:color/black</item>
    </style>

    <style name="AppTheme.Splash">
        <item name="android:windowDrawsSystemBarBackgrounds">true</item>
        <item name="android:windowTranslucentStatus">true</item>
        <item name="android:windowBackground">@mipmap/img_splash_bg</item>
    </style>
	</resources>


