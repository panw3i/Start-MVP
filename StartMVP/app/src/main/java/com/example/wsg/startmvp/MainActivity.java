package com.example.wsg.startmvp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wsg.startmvp.model.Phone;
import com.example.wsg.startmvp.mvp.MvpMainView;
import com.example.wsg.startmvp.mvp.impl.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements MvpMainView {


    MainPresenter mainPresenter;

    ProgressDialog progressDialog;



    //butterknife注入
    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.button_search)
    Button buttonSearch;
    @BindView(R.id.result_phone)
    TextView resultPhone;
    @BindView(R.id.result_province)
    TextView resultProvince;
    @BindView(R.id.result_type)
    TextView resultType;
    @BindView(R.id.result_carrier)
    TextView resultCarrier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mainPresenter = new MainPresenter(this);
        mainPresenter.attach(this);
    }



    @OnClick(R.id.button_search)
    public void onViewClicked() {
        //to_do

        //查询
        mainPresenter.searchPhoneInfo(inputPhone.getText().toString());
    }


    @Override
    public void showLoading() {
        if (progressDialog == null) {
//            progressDialog = ProgressDialog.show(this, "", "正在查询...", true, false);
        } else if (progressDialog.isShowing()) {
            progressDialog.setTitle("");
            progressDialog.setMessage("正在查询...");
        }
//        progressDialog.show();
    }

    @Override
    public void hidenLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void updateView() {
        Phone phone = mainPresenter.getPhoneInfo();
        resultPhone.setText("手机号：" + inputPhone.getText().toString());
        resultProvince.setText("省和市：" + phone.getProvince() );
        resultType.setText("运营商：" + phone.getCastName());
        resultCarrier.setText("卡类型：" + phone.getCarrier());
    }
}
