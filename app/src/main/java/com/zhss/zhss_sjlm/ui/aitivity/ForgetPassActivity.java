package com.zhss.zhss_sjlm.ui.aitivity;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.bean.RegistBean;
import com.zhss.zhss_sjlm.bean.Yanzhengma;
import com.zhss.zhss_sjlm.present.ForgetPresent;
import com.zhss.zhss_sjlm.tools.TimeUtil;
import com.zhss.zhss_sjlm.view.RegistView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by win7-64 on 2018/1/25.
 */

public class ForgetPassActivity extends BaseActivity<RegistView, ForgetPresent> implements RegistView {
    @BindView(R.id.edt_mob)
    EditText edtMob;
    @BindView(R.id.edt_code)
    EditText edtCode;
    @BindView(R.id.tv_code)
    TextView tvCode;
    @BindView(R.id.new_pass)
    EditText newPass;
    @BindView(R.id.btn_next)
    Button btnNext;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_forget;
    }

    @NonNull
    @Override
    public ForgetPresent createPresenter() {
        return new ForgetPresent();
    }

    @Override
    public void getYzm(Object o) {
        Yanzhengma yzm = (Yanzhengma)o;
        Toast.makeText(this, yzm.getMsg(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadSuccess(Object data) {
        RegistBean registBean =(RegistBean)data;
        Toast.makeText(this, registBean.getMsg(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadFail(String data) {

    }


    @OnClick({R.id.tv_code, R.id.btn_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_code:
                if (TextUtils.isEmpty(edtMob.getText().toString().trim()) || edtMob.getText().toString().trim().length() != 11) {
                    Toast.makeText(this, "请核对您的手机号码!", Toast.LENGTH_SHORT).show();
                    return;
                }
                final TimeUtil timeUtil = new TimeUtil(tvCode, "获取验证码");
                getPresenter().getYzm(edtMob.getText().toString().trim(),timeUtil);
                break;
            case R.id.btn_next:
                getPresenter().modifyPass(edtMob.getText().toString().trim(),
                        edtCode.getText().toString().trim(),
                        newPass.getText().toString().trim(),"2"
                );
                break;
        }
    }
}
