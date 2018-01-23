package com.zhss.zhss_sjlm.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public interface BaseView extends MvpView {
    void loadSuccess(Object data);
    void loadFail(Object data);
}
