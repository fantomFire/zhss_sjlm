package com.zhss.zhss_sjlm.base;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.nukc.stateview.StateView;
import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.tools.StatusBarUtils;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * 作者 by yugai 时间 16/10/31.
 * ＊ 邮箱 784787081@qq.com
 */

public abstract class BaseActivity<V extends MvpView,T extends BasePresent<V>> extends MvpActivity<V,T> {

    private Unbinder bind;
    public StateView mStateView;
    private T mPresent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉状态栏
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//禁止横屏
        StatusBarUtils.setColor(this, getResources().getColor(R.color.statusBarColor));
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
