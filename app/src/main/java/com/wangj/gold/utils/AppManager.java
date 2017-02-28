package com.wangj.gold.utils;

import android.app.Activity;
import android.content.Context;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by LeonWang.tao on 2016/12/6.
 */
public class AppManager {
    private static Stack<Activity> mActivityStack;

    private static AppManager instance_;

    private AppManager() {
    }

    public static AppManager getInstance() {
        if (instance_ == null) {
            instance_ = new AppManager();
        }

        if (mActivityStack == null) {
            mActivityStack = new Stack<>();
        }

        return instance_;
    }

    /**
     * 获取指定的Activity
     *
     * @param clazz 字节码
     * @return activity
     * @author hongfei.tao on 2016/8/6 13:21
     */
    public static Activity getActivity(Class<? extends Activity> clazz) {
        if (mActivityStack != null) {

            for (Activity activity : mActivityStack) {
                if (activity.getClass().equals(clazz)) {
                    return activity;
                }
            }
        }

        return null;
    }

    /**
     * 将Activity添加到管理栈中
     *
     * @author hongfei.tao on 2016/8/6 13:24
     */
    public void addActivity(Activity activity) {
        mActivityStack.add(activity);
    }

    /**
     * 获取当前栈顶Activity
     *
     * @author hongfei.tao on 2016/8/6 13:25
     */
    public Activity currentActivity() {
        return mActivityStack.lastElement();
    }

    /**
     * 销毁栈顶Activity
     *
     * @author hongfei.tao on 2016/8/6 13:28
     */
    public void finishActivity() {
        Activity activity = mActivityStack.lastElement();
        finishActivity(activity);
    }

    /**
     * 销毁指定的Activity
     *
     * @author hongfei.tao on 2016/8/6 13:29
     */
    public void finishActivity(Activity activity) {
        if (activity != null && mActivityStack.contains(activity)) {
            mActivityStack.remove(activity);
            activity.finish();
        }
    }

    /**
     * 移除Activity管理栈中指定的activity
     *
     * @author hongfei.tao on 2016/8/6 13:31
     */
    public void removeActivity(Activity activity) {
        if (activity != null && mActivityStack.contains(activity)) {
            mActivityStack.remove(activity);
        }
    }

    /**
     * 销毁指定类名的Activity
     *
     * @author hongfei.tao on 2016/8/6 13:33
     */
    public void finisActivity(Class<? extends Activity> clazz) {
        for (Activity activity : mActivityStack) {
            if (activity.getClass().equals(clazz)) {
                finishActivity(activity);
                break;
            }
        }
    }

    /**
     * 销毁当前栈中所有的Activity
     *
     * @author hongfei.tao on 2016/8/6 13:37
     */
    public void finishAllActivity() {
        Iterator<Activity> iterator = mActivityStack.iterator();
        while (iterator.hasNext()) {
            Activity activity = iterator.next();
            finishActivity(activity);
        }

        mActivityStack.clear();
    }


    /**
     * 退出应用程序
     */
    public void ExitApp(Context context) {
        try {
            finishAllActivity();
            System.exit(0);
            System.gc();
        } catch (Exception e) {	}
    }

}
