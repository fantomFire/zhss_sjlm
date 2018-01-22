package com.zhss.zhss_sjlm.base;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zhss.zhss_sjlm.apiserver.ApiRetrofit;
import com.zhss.zhss_sjlm.apiserver.ApiService;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 2018/1/20.
 */

public class BasePresent<V extends MvpView> extends MvpBasePresenter<V>{
 protected ApiService mApiService = ApiRetrofit.getInstance().getApiService();
    protected V view;

    private CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(V view) {
        super.attachView(view);
        this.view =view;
    }

    @Override
    public void detachView(boolean retainInstance) {
        super.detachView(retainInstance);
        view=null;
        onUnsubscribe();
    }

    public void addSubscription(Observable observable, Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

    //RXjava取消注册，以避免内存泄露
    public void onUnsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

}
