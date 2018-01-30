package com.zhss.zhss_sjlm.ui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.nukc.stateview.StateView;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.bean.DiscoverTitleBean;
import com.zhss.zhss_sjlm.present.DiscoverPresent;
import com.zhss.zhss_sjlm.ui.adapter.FrageVpAdapter;
import com.zhss.zhss_sjlm.view.BaseView;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class DiscoverFragment extends BaseFragment<BaseView, DiscoverPresent> implements BaseView {
    @BindView(R.id.discover_migic)
    MagicIndicator discoverMigic;
    @BindView(R.id.discover_vp)
    ViewPager discoverVp;
;
    Unbinder unbinder1;

    private StateView mstateview;
    private List<DiscoverTitleBean.DataBean> mtitles;
    private ItemFragment itemFragment;
    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void initView() {
       /* mstateview = StateView.inject(flContent);
        mstateview.showLoading();*/
        getPresenter().getTitle();

    }


    protected void initdatas() {
        if (mtitles == null) {
            return;
        }
        //将各个栏目fragment 添加到集合
        for (int i = 0; i < mtitles.size(); i++) {
            itemFragment = new ItemFragment();
            fragments.add(itemFragment);
        }

        //给viewpager 设置adapter
        discoverVp.setAdapter(new FrageVpAdapter(getFragmentManager(), fragments));
        discoverVp.requestDisallowInterceptTouchEvent(true);
        discoverVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                discoverMigic.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                discoverMigic.onPageSelected(position);
                itemFragment.setIndex(mtitles.get(position).getFind_id());

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                discoverMigic.onPageScrollStateChanged(state);
            }
        });
        discoverVp.setOffscreenPageLimit(mtitles.size());
        discoverVp.setCurrentItem(0);
        //栏目数据正确 设置
        initTitle();
    }


    //设置栏目数据
    private void initTitle() {
        CommonNavigator commonNavigator = new CommonNavigator(mContext);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return mtitles == null ? 0 : mtitles.size();
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int i) {
                ColorTransitionPagerTitleView simplePagerTitleView = new ColorTransitionPagerTitleView(context);
                simplePagerTitleView.setText(mtitles.get(i).getFind_name());
                simplePagerTitleView.setTextSize(17);
                simplePagerTitleView.setNormalColor(Color.parseColor("#444444"));
                simplePagerTitleView.setSelectedColor(Color.parseColor("#df1839"));
                System.out.println("vp+=="+discoverVp.getCurrentItem());
                System.out.println("vp++++"+i);
                simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.out.println("点击"+discoverVp.getCurrentItem());
                        System.out.println("点击++++"+i);
                        discoverVp.setCurrentItem(i);
                        itemFragment.setIndex(mtitles.get(i).getFind_id());


                    }
                });
                return simplePagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
                linePagerIndicator.setMode(linePagerIndicator.MODE_WRAP_CONTENT);
                linePagerIndicator.setColors(getResources().getColor(R.color.df1839));
                return linePagerIndicator;
            }
        });

        discoverMigic.setNavigator(commonNavigator);
        ViewPagerHelper.bind(discoverMigic, discoverVp);


    }

    @Override
    public int getLayoutId() {
        return R.layout.discover_fragment;
    }

    @Override
    public DiscoverPresent createPresenter() {
        return new DiscoverPresent();
    }

    @Override
    public void loadSuccess(Object data) {
        DiscoverTitleBean datas = (DiscoverTitleBean) data;
        System.out.println(data);
        if (datas.getStatus().equals("200")) {
          //  mstateview.showContent();
            mtitles = datas.getData();
          initdatas();
          initTitle();
        }

    }

    @Override
    public void loadFail(Object data) {
        System.out.println(data.toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }
}
