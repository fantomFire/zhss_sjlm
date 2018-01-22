package com.zhss.zhss_sjlm.apiserver;


import com.zhss.zhss_sjlm.bean.CategreyBean;
import com.zhss.zhss_sjlm.bean.LoginBean;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2018/1/20.
 */

public interface ApiService {

    //登录
    @POST("Login/sign")
    Observable<LoginBean> loading(@Query("mobile") String username, @Query("password") String password);

    //分类
    @GET("classify/classify")
    Observable<CategreyBean> getCateData();
}
