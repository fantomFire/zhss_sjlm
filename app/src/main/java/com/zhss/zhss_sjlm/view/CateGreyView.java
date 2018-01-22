package com.zhss.zhss_sjlm.view;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zhss.zhss_sjlm.bean.CategreyBean;

/**
 * Created by win7-64 on 2018/1/22.
 */

public interface CateGreyView extends MvpView {
    void success(CategreyBean data);
    void  fail(String msg);
}
