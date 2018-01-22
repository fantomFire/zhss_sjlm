package com.zhss.zhss_sjlm.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.MvpView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author ChayChan
 * @description: Fragment的基类
 * @date 2017/6/10  17:09
 */

public abstract class BaseFragment<V extends MvpView, T extends BasePresent<V>> extends MvpFragment<V, T> {

    private View rootView;
    public Context mContext;
    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(getContentView(), container, false);
            mContext = getActivity();
            unbinder = ButterKnife.bind(this, rootView);
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    protected abstract void initView();

    /**
     * 加载布局文件
     */
    public abstract int getContentView();
    

   

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
