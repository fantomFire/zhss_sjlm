package com.zhss.zhss_sjlm.ui.fragment;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.present.DiscoverPresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class DiscoverFragment extends BaseFragment<BaseView,DiscoverPresent> implements BaseView {
    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
        return  R.layout.discover_fragment;
    }

    @Override
    public DiscoverPresent createPresenter() {
        return new DiscoverPresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
