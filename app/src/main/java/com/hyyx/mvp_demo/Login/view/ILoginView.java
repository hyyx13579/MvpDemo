package com.hyyx.mvp_demo.Login.view;

/**
 * Created by hyyx on 2017/5/16.
 */

public interface ILoginView {
    String getUserName();

    String getUserPwd();

    void toMainActivity();

    void toErrorLogin();


}
