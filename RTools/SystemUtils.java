package com.meishe.cadencedemo.utils;

import android.os.Build;
import android.view.View;
import android.view.Window;

/**
 * @author LiFei
 * @version 1.0
 * @title
 * @description 该类主要功能描述
 * @company 美摄
 * @created 2019.11.20 15:21
 * @changeRecord [修改记录] <br/>
 */
public class SystemUtils {
    /**
     * 隐藏虚拟按键，并且可设置为全屏
     *
     * @param window
     */
    public static void hideBottomUIMenu(Window window) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            View v = window.getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            View decorView = window.getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    // | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
}
