package com.zhss.zhss_sjlm.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zhss.zhss_sjlm.MainActivity;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.base.BaseActivity;
import com.zhss.zhss_sjlm.bean.LoginBean;
import com.zhss.zhss_sjlm.present.LoginPresent;
import com.zhss.zhss_sjlm.ui.aitivity.ForgetPassActivity;
import com.zhss.zhss_sjlm.ui.aitivity.RegisterActivity;
import com.zhss.zhss_sjlm.view.LoginView;

import butterknife.BindView;
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
    @BindView(R.id.ll_content)
    LinearLayout llContent;

    @NonNull
    @Override
    public LoginPresent createPresenter() {
        return new LoginPresent();
    }

    @Override
    public void success(LoginBean data) {
        System.out.println("登陆成功" + data.toString());
        startActivity(new Intent(this, MainActivity.class));
        //  finish();
    }

    @Override
    public void fail(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        if (intent != null) {
            String mPhone = intent.getStringExtra("mPhone");
            String mPass = intent.getStringExtra("mPass");
            edtPhone.setText(mPhone);
            edtPass.setText(mPass);
        }
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }


    @OnClick({R.id.btn_login, R.id.tv_register, R.id.tv_forget})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:

                // getPresenter().login(edtPhone.getText().toString(), edtPass.getText().toString());
                   startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.tv_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.tv_forget:
                startActivity(new Intent(this, ForgetPassActivity.class));
                break;
        }
    }
}
