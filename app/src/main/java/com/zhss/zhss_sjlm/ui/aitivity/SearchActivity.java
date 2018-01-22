package com.zhss.zhss_sjlm.ui.aitivity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sjlm.R;
import com.example.sjlm.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 搜索页面
 */
public class SearchActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.edt_search)
    EditText edtSearch;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.rv_hot)
    RecyclerView rvHot;
    @BindView(R.id.rv_history)
    RecyclerView rvHistory;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {


    }

    @Override
    public int provideLayoutId() {
        return R.layout.activity_search;
    }


    @OnClick({R.id.iv_back, R.id.tv_cancel})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.tv_cancel:
                break;
        }
    }
}
