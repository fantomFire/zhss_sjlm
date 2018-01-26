package com.zhss.zhss_sjlm.ui.aitivity;

import android.support.annotation.NonNull;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.present.RegistPresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/24.
 */

public class RejectActivity extends BaseActivity<BaseView,RegistPresent> implements BaseView {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_reject;
    }

    @NonNull
    @Override
    public RegistPresent createPresenter() {
        return new RegistPresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
