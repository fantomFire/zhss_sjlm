package com.zhss.zhss_sjlm.view;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zhss.zhss_sjlm.bean.LoginBean;

/**
 * Created by win7-64 on 2018/1/22.
 */

public interface LoginView  extends MvpView{
    void success(LoginBean data);
    void fail(String code);
}
