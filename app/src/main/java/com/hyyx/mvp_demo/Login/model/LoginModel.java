package com.hyyx.mvp_demo.Login.model;

/**
 * Created by hyyx on 2017/5/16.
 */

public class LoginModel implements ILoginModel {
    private String LoginName;
    private String LoginPassWord;

    public String getLoginPassWord() {
        return LoginPassWord;
    }

    public void setLoginPassWord(String loginPassWord) {
        LoginPassWord = loginPassWord;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }


    @Override
    public void getData(final String loginName, final String loginPwd, final LoginStateListener loginStateListener) {
        //模拟网络请求

        if ("123".equals(loginName) && "123".equals(loginPwd)) {
            LoginModel model = new LoginModel();
            model.setLoginName(loginName);
            model.setLoginPassWord(loginPwd);
            loginStateListener.LoginSuccess(model);
        } else {
            loginStateListener.LoginFailure("登录失败");
        }


    }
}
