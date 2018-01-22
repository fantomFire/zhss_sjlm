package com.zhss.zhss_sjlm.apiserver;

import com.zhss.zhss_sjlm.path.Path;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/1/20.
 */

public class ApiRetrofit {
    private static ApiRetrofit mApiRetrofit;
    private final OkHttpClient client;
    private final Retrofit mApi;
    private final ApiService apiService;

    public ApiRetrofit(){
        client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();

        mApi = new Retrofit.Builder()
                .baseUrl(Path.BASE_ZHSS)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        apiService = mApi.create(ApiService.class);

    }
    //获取apiRetrofit 单利
    public static ApiRetrofit getInstance(){
        if (mApiRetrofit==null){
            synchronized (Object.class){
                mApiRetrofit = new ApiRetrofit();
            }
        }
        return mApiRetrofit;
    }

    public ApiService getApiService(){
        return  apiService;
    }


}
