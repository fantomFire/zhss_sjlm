package com.zhss.zhss_sjlm.ui.aitivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.bean.RegistBean;
import com.zhss.zhss_sjlm.bean.Yanzhengma;
import com.zhss.zhss_sjlm.present.RegisterPresent;
import com.zhss.zhss_sjlm.tools.TimeUtil;
import com.zhss.zhss_sjlm.ui.LoginActivity;
import com.zhss.zhss_sjlm.view.RegistView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by win7-64 on 2018/1/24.
 */

public class RegisterActivity extends BaseActivity<RegistView, RegisterPresent> implements RegistView {
    @BindView(R.id.edt_mob)
    EditText edtMob;
    @BindView(R.id.edt_code)
    EditText edtCode;
    @BindView(R.id.tv_code)
    TextView tvCode;
    @BindView(R.id.rb_reg)
    RadioButton rbReg;
    @BindView(R.id.tv_agreement)
    TextView tvAgreement;
    @BindView(R.id.btn_next)
    Button btnNext;
    @BindView(R.id.et_mpass)
    EditText etMpass;
    private String mPhone;
    private String mPass;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_register;
    }

    @NonNull
    @Override
    public RegisterPresent createPresenter() {
        return new RegisterPresent();
    }

    @Override
    public void getYzm(Object o) {
        Yanzhengma yz = (Yanzhengma) o;
        if (yz.getStatus().equals("200")) {
            Toast.makeText(this, "验证码已发送!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, yz.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void loadSuccess(Object data) {
        RegistBean registBean = (RegistBean) data;
        Toast.makeText(this, registBean.getMsg(), Toast.LENGTH_SHORT).show();
        if (registBean.getStatus().equals("200")) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra("mPhone", mPhone);
            intent.putExtra("mPass", mPass);
            startActivity(intent);
        }

    }

    @Override
    public void loadFail(String data) {

    }


    @OnClick({R.id.rb_reg, R.id.btn_next, R.id.tv_code})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb_reg:
                break;
            case R.id.btn_next:
                if (rbReg.isChecked()) {
                    mPhone = edtMob.getText().toString().trim();
                    mPass = etMpass.getText().toString().trim();
                    getPresenter().toRegist(mPhone, edtCode.getText().toString().trim(), mPass
                    );

                } else {
                    Toast.makeText(this, "您还未同意注册协议", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.tv_code:

                if (TextUtils.isEmpty(edtMob.getText().toString().trim()) || edtMob.getText().toString().trim().length() != 11) {
                    Toast.makeText(this, "请核对您的手机号码!", Toast.LENGTH_SHORT).show();
                    return;
                }
                final TimeUtil timeUtil = new TimeUtil(tvCode, "获取验证码");

                getPresenter().getYZM(edtMob.getText().toString().trim(), "2", timeUtil);
                break;
        }
    }


}
