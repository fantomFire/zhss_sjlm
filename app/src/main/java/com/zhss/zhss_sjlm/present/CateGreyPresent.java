package com.zhss.zhss_sjlm.present;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.CategreyBean;
import com.zhss.zhss_sjlm.view.CateGreyView;

import rx.Subscriber;

/**
 * Created by win7-64 on 2018/1/22.
 */

public class CateGreyPresent extends BasePresent<CateGreyView> {
    public void loadData() {
        addSubscription(mApiService.getCateData(), new Subscriber<CategreyBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(CategreyBean categreyBean) {
                getView().success(categreyBean);
            }
        });
    }
}
