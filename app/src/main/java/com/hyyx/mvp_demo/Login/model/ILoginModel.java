package com.hyyx.mvp_demo.Login.model;

/**
 * Created by hyyx on 2017/5/16.
 */

public interface ILoginModel {
    void getData(String loginName, String loginPwd,LoginStateListener loginStateListener);
}
