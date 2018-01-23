package com.zhss.zhss_sjlm.ui.fragment;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.present.MerchantPresent;
import com.zhss.zhss_sjlm.view.BaseView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class MerchantFragment extends BaseFragment<BaseView,MerchantPresent> implements BaseView{
    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
       return R.layout.fragment_merchant;
    }

    @Override
    public MerchantPresent createPresenter() {
        return new MerchantPresent();
    }

    @Override
    public void loadSuccess(Object data) {

    }

    @Override
    public void loadFail(Object data) {

    }
}
