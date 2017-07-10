package com.hyyx.mvp_demo.Common;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by hyyx on 2017/5/16.
 */

public abstract class BaseActivity<T extends BasePresenter> extends Activity {

    T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());
        initView();
        dealView();
        presenter = initPresenter();

    }

    public abstract T initPresenter();

    public abstract void initView();

    public abstract int getlayout();

    public abstract void dealView();

}
