package com.hyyx.mvp_demo.Login.model;

/**
 * Created by hyyx on 2017/5/16.
 */

public interface LoginStateListener {
    void LoginSuccess(LoginModel loginModel);

    void LoginFailure(String err);
}
