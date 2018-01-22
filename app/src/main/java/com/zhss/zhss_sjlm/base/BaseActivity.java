package com.zhss.zhss_sjlm.base;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

import com.github.nukc.stateview.StateView;
import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.MvpView;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * 作者 by yugai 时间 16/10/31.
 * ＊ 邮箱 784787081@qq.com
 */

public abstract class BaseActivity<V extends MvpView,T extends BasePresent<V>> extends MvpActivity<V,T> {

    private Unbinder bind;
    public StateView mStateView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉状态栏

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//禁止横屏
        setContentView(getLayout());

        bind = ButterKnife.bind(this);
       // AppManager.getAppManager().addActivity(this);
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(bind!=null){bind.unbind();}
       // AppManager.getAppManager().removeActivity(this);
    }

    protected abstract int getLayout();
}
