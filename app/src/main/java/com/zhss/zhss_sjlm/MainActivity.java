package com.zhss.zhss_sjlm;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.present.CateGreyPresent;
import com.zhss.zhss_sjlm.tools.PrefUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    private static final String[] FIVE = new String[]{"首页", "分类", "商家中心", "发现", "我的"};
    private static final String[] FOUR = new String[]{"首页", "分类", "发现", "我的"};
    private static final Integer[] IMAGES1_FIVE = new Integer[]{R.mipmap.f1a, R.mipmap.f2a, R.mipmap.f3a, R.mipmap.f4a, R.mipmap.f5a};
    private static final Integer[] IMAGES2_FIVE = new Integer[]{R.mipmap.f1h, R.mipmap.f2h, R.mipmap.f3h, R.mipmap.f4h, R.mipmap.f5h};
    private static final Integer[] IMAGES1_FOUR = new Integer[]{R.mipmap.f1a, R.mipmap.f2a, R.mipmap.f4a, R.mipmap.f5a};
    private static final Integer[] IMAGES2_FOUR = new Integer[]{R.mipmap.f1h, R.mipmap.f2h, R.mipmap.f4h, R.mipmap.f5h};
    private List<String> mDataList;
    private List<Integer> mImg1;
    private List<Integer> mImg2;
    private ArrayList<Fragment> mPagers = new ArrayList<Fragment>();
    private ViewPager mViewPager;
    public static MainActivity MAIN;

    private String userid;

    private String member_type;
    private boolean isExit = false;


    @NonNull
    @Override
    public CateGreyPresent createPresenter() {
        return null;
    }

    @Override
    protected void initData() {
        member_type = PrefUtils.getString(this, "member_type", "1");

    }

    @Override
    protected void initView() {


    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


}