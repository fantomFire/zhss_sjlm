package com.zhss.zhss_sjlm.present;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.DiscoverBean;
import com.zhss.zhss_sjlm.view.BaseView;

import rx.Subscriber;

/**
 * Created by win7-64 on 2018/1/29.
 */

public class DiscocerItemPresent  extends BasePresent<BaseView>{
    public void getDiscoverItemData(String currentId) {
        addSubscription(mApiService.getItemData(currentId), new Subscriber<DiscoverBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
            getView().loadFail(e);
            }

            @Override
            public void onNext(DiscoverBean data) {
            getView().loadSuccess(data);
            }
        });
    }
}
