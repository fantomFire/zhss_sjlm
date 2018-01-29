package com.zhss.zhss_sjlm.present;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.DiscoverTitleBean;
import com.zhss.zhss_sjlm.view.BaseView;

import rx.Subscriber;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class DiscoverPresent extends BasePresent<BaseView> {
    public void getTitle() {
        addSubscription(mApiService.getDiscoverTitle(), new Subscriber<DiscoverTitleBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
            getView().loadFail("栏目数据错误!");
            }

            @Override
            public void onNext(DiscoverTitleBean data) {
            getView().loadSuccess(data);
            }
        });
    }
}
