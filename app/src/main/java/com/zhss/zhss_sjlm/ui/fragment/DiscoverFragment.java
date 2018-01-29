package com.zhss.zhss_sjlm.ui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.nukc.stateview.StateView;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.bean.DiscoverTitleBean;
import com.zhss.zhss_sjlm.present.DiscoverPresent;
import com.zhss.zhss_sjlm.ui.adapter.FrageVpAdapter;
import com.zhss.zhss_sjlm.view.BaseView;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ClipPagerTitleView;

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
    Unbinder unbinder;
    @BindView(R.id.fl_content)
    FrameLayout flContent;
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

    @Override
    protected void intData() {
        if (mtitles == null) {
            return;
        }
        //将各个栏目fragment 添加到集合
        for (int i = 0; i < mtitles.size(); i++) {
            itemFragment = new ItemFragment();
            fragments.add(itemFragment);
        }
        System.out.println("mfragemt"+fragments.size());
        //给viewpager 设置adapter
        discoverVp.setAdapter(new FrageVpAdapter(getChildFragmentManager(), fragments));
        discoverVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                discoverMigic.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                discoverMigic.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                discoverMigic.onPageScrollStateChanged(state);
            }
        });
    }


    //设置栏目数据
    private void initTitle() {
        CommonNavigator commonNavigator = new CommonNavigator(getActivity());
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return mtitles == null ? 0 : mtitles.size();
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int i) {
                ClipPagerTitleView simplePagerTitleView = new ClipPagerTitleView(context);
                simplePagerTitleView.setText(mtitles.get(i).getFind_name());
                simplePagerTitleView.setTextColor(getResources().getColor(R.color.colorBlack));
//                simplePagerTitleView.setPadding(30,0,30,0);
                simplePagerTitleView.setTextSize(30);

                simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        discoverVp.setCurrentItem(i);
                        System.out.println("当前"+i);

                    }
                });
                return simplePagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                LinePagerIndicator triangularPagerIndicator = new LinePagerIndicator(context);
//                triangularPagerIndicator.setXOffset(20);
                triangularPagerIndicator.setLineHeight(2);

                triangularPagerIndicator.setLineWidth(115);

                triangularPagerIndicator.setMode(triangularPagerIndicator.MODE_EXACTLY);
                triangularPagerIndicator.setColors(Color.parseColor("#f5511e"));
                return triangularPagerIndicator;
            }
        });
        discoverMigic.setNavigator(commonNavigator);
        LinearLayout titleContainer = commonNavigator.getTitleContainer();
        titleContainer.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        titleContainer.setDividerDrawable(new ColorDrawable() {
            @Override
            public int getIntrinsicWidth() {
                return UIUtil.dip2px(getActivity(), 15);
            }

        });
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
        if (datas.getStatus().equals("200")) {
          //  mstateview.showContent();
            mtitles = datas.getData();
            //栏目数据正确 设置
            initTitle();
        } else {
            Toast.makeText(mContext, "栏目数据有误!", Toast.LENGTH_SHORT).show();


        }

    }

    @Override
    public void loadFail(Object data) {

        Toast.makeText(mContext, "栏目数据有误!", Toast.LENGTH_SHORT).show();
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
