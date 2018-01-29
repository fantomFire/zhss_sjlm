package com.zhss.zhss_sjlm.ui.fragment;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.present.MinePresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class MineFragment extends BaseFragment<BaseView,MinePresent> implements BaseView{
    @Override
    protected void intData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.home_fragment;
    }

    @Override
    public MinePresent createPresenter() {
        return new MinePresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
