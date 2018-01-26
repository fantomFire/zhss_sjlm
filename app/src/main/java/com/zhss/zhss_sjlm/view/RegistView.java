package com.zhss.zhss_sjlm.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by win7-64 on 2018/1/24.
 */

public interface RegistView extends MvpView{
    void getYzm(Object o);
    void loadSuccess(Object data);
    void loadFail(String data);
}
