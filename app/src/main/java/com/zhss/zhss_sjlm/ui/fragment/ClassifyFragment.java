package com.zhss.zhss_sjlm.ui.fragment;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.present.CateGreyPresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class ClassifyFragment extends BaseFragment<BaseView,CateGreyPresent> implements BaseView {
    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
       return R.layout.fragment_classify;
    }

    @Override
    public CateGreyPresent createPresenter() {
        return new CateGreyPresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
