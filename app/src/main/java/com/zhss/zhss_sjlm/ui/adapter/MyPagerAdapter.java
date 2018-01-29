package com.zhss.zhss_sjlm.ui.adapter;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13 0013.
 */

//给ViePager设置适配器
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mPagers = new ArrayList<Fragment>();
    private FragmentManager fm;

    public MyPagerAdapter(FragmentManager fm, List<Fragment> mPagers) {
        super(fm);
        this.fm = fm;
        this.mPagers = mPagers;
    }

    @Override
    public int getCount() {
        return mPagers.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mPagers.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
