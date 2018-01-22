package com.zhss.zhss_sjlm.present;

import android.text.TextUtils;

import com.zhss.zhss_sjlm.base.BasePresent;
import com.zhss.zhss_sjlm.bean.LoginBean;
import com.zhss.zhss_sjlm.view.LoginView;

import rx.Subscriber;

/**
 * Created by win7-64 on 2018/1/22.
 */

public class LoginPresent extends BasePresent<LoginView> {
    public void login(String mPhone, String mPass) {
        if(TextUtils.isEmpty(mPhone)){
            getView().fail("请输入您的账号!");
            return;
        }
        if (TextUtils.isEmpty(mPass)){
            getView().fail("请输入您的密码!");
            return;
        }
        addSubscription(mApiService.loading(mPhone, mPass), new Subscriber<LoginBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(LoginBean loginBean) {
                String msg = loginBean.msg;
                String status = loginBean.status;
                if(status.equals("200")){
                    getView().success(loginBean);
                }else {
                    getView().fail(msg);
                }
            }
        });
    }
}
