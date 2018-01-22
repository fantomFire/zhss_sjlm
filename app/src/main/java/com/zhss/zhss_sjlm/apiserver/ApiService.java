package com.zhss.zhss_sjlm.apiserver;


import com.zhss.zhss_sjlm.bean.LoginBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2018/1/20.
 */

public interface ApiService {

    //登录
    @GET("Login/sign")
    Observable<LoginBean> loading(@Query("username") String username, @Query("password") String password);
}
