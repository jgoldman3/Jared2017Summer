package com.example.jaredgoldman.jared2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jaredgoldman.jared2017summer.audio.BaseBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.activity_a_a)
    public void toA(View view) {
        goToActivity(ActivityA.class);
    }

    @OnClick(R.id.activity_a_b)
    public void toB(View view) {
        goToActivity(ActivityB.class);
    }

    @OnClick(R.id.activity_a_c)
    public void toC(View view) {
        goToActivity(ActivityC.class);
    }

    @OnClick(R.id.activity_a_d)
    public void toD(View view) {
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        shortToast("onCreate");
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        String bs = bundle.getString("StringBundle");
        int bi = bundle.getInt("IntegerBundle",0);
        BaseBean bean = (BaseBean) bundle.getSerializable("Object");

        shortToast(bean.getName());
        shortToast(bs);
        shortToast("Integer is: "+bi);
        String s = intent.getStringExtra("StringInfo");
        int i = intent.getIntExtra("IntegerInfo",0);
        shortToast(s);
        shortToast("Integer is: "+i);


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onNewIntent");
    }
}
