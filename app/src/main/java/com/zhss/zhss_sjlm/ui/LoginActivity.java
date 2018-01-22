package com.zhss.zhss_sjlm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhss.zhss_sjlm.MainActivity;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.bean.LoginBean;
import com.zhss.zhss_sjlm.present.LoginPresent;
import com.zhss.zhss_sjlm.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by win7-64 on 2018/1/22.
 */

public class LoginActivity extends BaseActivity<LoginView, LoginPresent> implements LoginView {


    @BindView(R.id.edt_pass)
    EditText edtPass;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.tv_forget)
    TextView tvForget;
    @BindView(R.id.edt_phone)
    EditText edtPhone;

    @NonNull
    @Override
    public LoginPresent createPresenter() {
        return new LoginPresent();
    }

    @Override
    public void success(LoginBean data) {
        System.out.println("登陆成功" + data.toString());
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void fail(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.tv_register, R.id.tv_forget})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:

                System.out.println("账号"+edtPhone.getText().toString());
                getPresenter().login(edtPhone.getText().toString(),edtPass.getText().toString());
                break;
            case R.id.tv_register:
                break;
            case R.id.tv_forget:
                break;
        }
    }
}
