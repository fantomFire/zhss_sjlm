package com.zhss.zhss_sjlm.ui.fragment;

import android.widget.ExpandableListView;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseFragment;
import com.zhss.zhss_sjlm.bean.CategreyBean;
import com.zhss.zhss_sjlm.present.CateGreyPresent;
import com.zhss.zhss_sjlm.ui.adapter.MyExpandableListViewAdapter;
import com.zhss.zhss_sjlm.view.BaseView;

import java.util.List;

import butterknife.BindView;

/**
 * Created by win7-64 on 2018/1/23.
 */

public class ClassifyFragment extends BaseFragment<BaseView, CateGreyPresent> implements BaseView {

    @BindView(R.id.expandableList)
    ExpandableListView expandableList;

    private List<CategreyBean.MsgBean> dataList;
    private MyExpandableListViewAdapter adapter;

    @Override
    protected void intData() {

    }

    @Override
    protected void initView() {
        adapter = new MyExpandableListViewAdapter(mContext);
        expandableList.setAdapter(adapter);
        // 隐藏分组指示器
        expandableList.setGroupIndicator(null);
        // 默认展开第一组
//        expandableList.expandGroup(0);
        getPresenter().loadData();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_classify;
    }

    @Override
    public CateGreyPresent createPresenter() {
        return new CateGreyPresent();
    }

    @Override
    public void loadSuccess(Object data) {
        CategreyBean datas = (CategreyBean) data;
        if (datas.getStatus().equals("200")) {
            dataList = datas.getMsg();
            System.out.println("分类=="+dataList.size());
          adapter.setData(dataList);
            adapter.notifyDataSetChanged();
        }
    }




        @Override
    public void loadFail(Object data) {

    }




}
