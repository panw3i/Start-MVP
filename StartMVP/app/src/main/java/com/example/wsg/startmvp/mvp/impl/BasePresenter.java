package com.example.wsg.startmvp.mvp.impl;

import android.content.Context;

/**
 * 项目名：StartMVP
 * 包名：com.example.wsg.startmvp.mvp.impl
 * 文件名：BasePresenter
 * 创建者：wsg
 * 创建时间：2017/8/3  1:28
 * 描述：Presenter基类
 */

public class BasePresenter {

    Context mContext;

    public void attach(Context context) {
        mContext = context;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onDestroy() {
        mContext = null;
    }

}
