package com.zhss.zhss_sjlm.apiserver;


import com.zhss.zhss_sjlm.bean.CategreyBean;
import com.zhss.zhss_sjlm.bean.LoginBean;
import com.zhss.zhss_sjlm.bean.MineInfoBean;
import com.zhss.zhss_sjlm.bean.RegistBean;
import com.zhss.zhss_sjlm.bean.Yanzhengma;

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

    //获取验证码
    @POST("Service/getyzm")
    Observable<Yanzhengma> getYzmCode(@Query("mobile") String mobile);

    //注册接口
    @POST("Login/register")
    Observable<RegistBean> toRegist(@Query("mobile") String mPhone, @Query("code") String code, @Query("password") String mPass);

    //修改密码
    @POST("Login/password")
    Observable<RegistBean> modifyNewpass(@Query("mobile") String mPhone, @Query("code") String mCode,
                                         @Query("password") String mPass, @Query("type") String type);

    //个人中心
    @GET("userinfo/index")
    Observable<MineInfoBean> getUserInfo(@Query("uid")String uid);














}
