package com.zhss.zhss_sjlm.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.github.nukc.stateview.StateView;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.bean.DiscoverBean;
import com.zhss.zhss_sjlm.present.DiscocerItemPresent;
import com.zhss.zhss_sjlm.ui.adapter.DiscoverAdapter;
import com.zhss.zhss_sjlm.view.BaseView;

import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by win7-64 on 2018/1/29.
 */

public class ItemFragment extends BaseFragment<BaseView, DiscocerItemPresent> implements BaseView {
    @BindView(R.id.rec_discover)
    RecyclerView recDiscover;
    Unbinder unbinder;
    @BindView(R.id.fl_content)
    FrameLayout flContent;
    private StateView mStateView;
    private String currentId="1";
    private List<DiscoverBean.MsgBean> dataList;
    private DiscoverAdapter discoverAdapter;

    @Override
    protected void intData() {

    }

    @Override
    protected void initView() {
      //  mStateView = StateView.inject(flContent);
      //  mStateView.showLoading();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recDiscover.setLayoutManager(linearLayoutManager);
        discoverAdapter = new DiscoverAdapter(getActivity());
        recDiscover.setAdapter(discoverAdapter);

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_item;
    }

    @Override
    public DiscocerItemPresent createPresenter() {
        return new DiscocerItemPresent();
    }

    @Override
    public void loadSuccess(Object data) {
        DiscoverBean datas = (DiscoverBean)data;
        if(datas.getStatus().equals("200")){
          //  mStateView.showContent();
            dataList = datas.getMsg();
            System.out.println("数据"+datas.toString());
            discoverAdapter.setData(dataList);
            discoverAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void loadFail(Object data) {
        Toast.makeText(mContext, data.toString(), Toast.LENGTH_SHORT).show();
    }



    public void setIndex(String find_id) {
        currentId = find_id;
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("item+"+currentId);
        getPresenter().getDiscoverItemData(currentId);
    }
}
