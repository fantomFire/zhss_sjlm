package com.zhss.zhss_sjlm.present;

import android.text.TextUtils;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.RegistBean;
import com.zhss.zhss_sjlm.bean.Yanzhengma;
import com.zhss.zhss_sjlm.tools.TimeUtil;
import com.zhss.zhss_sjlm.view.RegistView;

import rx.Subscriber;

/**
 * Created by win7-64 on 2018/1/25.
 */

public class ForgetPresent extends BasePresent<RegistView> {

    public void getYzm(String mPhone, TimeUtil timeUtil) {
        timeUtil.RunTimer();

        addSubscription(mApiService.getYzmCode(mPhone), new Subscriber<Yanzhengma>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Yanzhengma yzm) {
                getView().getYzm(yzm);
            }
        });
    }

    public void modifyPass(String mPhone, String mCode, String mPass, String type) {
        if (TextUtils.isEmpty(mPhone) || mPhone.length() != 11) {
            getView().loadFail("请核对您的手机号码!");
            return;
        }
        if(TextUtils.isEmpty(mCode)){
            getView().loadFail("请输入验证码");
            return;
        }
        if (TextUtils.isEmpty(mPass)){
            getView().loadFail("请输入新密码");
            return;
        }
        addSubscription(mApiService.modifyNewpass(mPhone, mCode, mPass, type), new Subscriber<RegistBean>() {
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
