package com.zhss.zhss_sjlm.ui.fragment;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.present.DiscocerItemPresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/29.
 */

public class ItemFragment extends BaseFragment<BaseView,DiscocerItemPresent> implements BaseView{
    @Override
    protected void intData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_item;
    }

    @Override
    public DiscocerItemPresent createPresenter() {
        return new DiscocerItemPresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
