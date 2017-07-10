package com.hyyx.mvp_demo.Login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hyyx.mvp_demo.Common.BaseActivity;
import com.hyyx.mvp_demo.Common.BasePresenter;
import com.hyyx.mvp_demo.Login.presenter.LoginPresenter;
import com.hyyx.mvp_demo.MainActivity;
import com.hyyx.mvp_demo.R;

public class LoginActivity extends BaseActivity<LoginPresenter> implements ILoginView {


    private EditText edtName;
    private EditText edtPwd;
    private Button btnLogin;
    LoginPresenter loginPresenter = new LoginPresenter(this);

    @Override
    public LoginPresenter initPresenter() {
        return loginPresenter;

    }

    @Override
    public void initView() {
        edtName = ((EditText) findViewById(R.id.edt_name));
        edtPwd = ((EditText) findViewById(R.id.edt_pwd));
        btnLogin = ((Button) findViewById(R.id.btn_login));

    }

    @Override
    public int getlayout() {
        return R.layout.activity_login;
    }

    @Override
    public void dealView() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.login();
            }
        });

    }

    @Override
    public String getUserName() {
        return edtName.getText().toString();
    }

    @Override
    public String getUserPwd() {
        return edtPwd.getText().toString();
    }

    @Override
    public void toMainActivity() {
        startActivity(new Intent(this, MainActivity.class));

    }

    @Override
    public void toErrorLogin() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();

    }
}
