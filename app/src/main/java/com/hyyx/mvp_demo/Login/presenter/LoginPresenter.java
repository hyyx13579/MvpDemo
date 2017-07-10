package com.hyyx.mvp_demo.Login.presenter;

import android.content.Context;
import android.content.Intent;

import com.hyyx.mvp_demo.Common.BasePresenter;
import com.hyyx.mvp_demo.Login.model.LoginModel;
import com.hyyx.mvp_demo.Login.model.LoginStateListener;
import com.hyyx.mvp_demo.Login.view.ILoginView;
import com.hyyx.mvp_demo.Login.view.LoginActivity;

/**
 * Created by hyyx on 2017/5/16.
 */

public class LoginPresenter extends BasePresenter<LoginActivity> {

    private LoginModel model;
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        this.model = new LoginModel();
    }


//    @Override
//    protected void init() {
//
//
//    }

    public void login() {
        model.getData(loginView.getUserName(), loginView.getUserPwd(), new LoginStateListener() {
            @Override
            public void LoginSuccess(LoginModel loginModel) {
                loginView.toMainActivity();
            }

            @Override
            public void LoginFailure(String e) {
                loginView.toErrorLogin();
            }
        });


    }
}
