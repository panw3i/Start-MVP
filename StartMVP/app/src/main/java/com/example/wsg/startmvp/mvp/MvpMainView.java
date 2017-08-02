package com.example.wsg.startmvp.mvp;

/**
 * 项目名：StartMVP
 * 包名：com.example.wsg.startmvp.mvp
 * 文件名：MvpMainView
 * 创建者：wsg
 * 创建时间：2017/8/3  1:18
 * 描述：MainActivity接口
 */

public interface MvpMainView extends MvpLodingView{
    void showToast(String msg);
    void updateView();
}
