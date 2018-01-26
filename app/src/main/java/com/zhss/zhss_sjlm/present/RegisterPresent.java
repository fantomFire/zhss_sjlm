package com.zhss.zhss_sjlm.present;

import android.text.TextUtils;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.RegistBean;
import com.zhss.zhss_sjlm.bean.Yanzhengma;
import com.zhss.zhss_sjlm.tools.TimeUtil;
import com.zhss.zhss_sjlm.view.RegistView;

import rx.Subscriber;


/**
 * Created by win7-64 on 2018/1/24.
 */

public class RegisterPresent extends BasePresent<RegistView> {
    public void getYZM(String mPhone, String type, TimeUtil timeUtil) {
        if (TextUtils.isEmpty(mPhone)) {
            getView().loadFail("请输入手机号码!");
            return;
        }
        timeUtil.RunTimer();
        addSubscription(mApiService.getYzmCode(mPhone), new Subscriber<Yanzhengma>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onNext(Yanzhengma data) {
                getView().getYzm(data);
            }
        });
    }


    public void toRegist(String mPhone, String code, String mPass) {
        addSubscription(mApiService.toRegist(mPhone, code, mPass), new Subscriber<RegistBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(RegistBean registBean) {
                getView().loadSuccess(registBean);
            }

        });


    }
}
