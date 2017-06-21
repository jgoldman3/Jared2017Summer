package com.example.jaredgoldman.jared2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class DialogActivity extends BaseActivity {

    private int checkedID = 0;

    @BindView(R.id.activity_dialog_rad)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_ok)
    public void ok(View view) {
        switch (checkedID){
            case R.id.activity_dialog_rad1:
                shortToast("You chose number 1.");
                break;
            case R.id.activity_dialog_rad2:
                shortToast("You chose number 2.");
                break;
            case R.id.activity_dialog_rad3:
                shortToast("You chose number 3.");
                break;
            case R.id.activity_dialog_rad4:
                shortToast("You chose number 4.");
                break;
            case R.id.activity_dialog_rad5:
                shortToast("You chose number 5.");
                break;
            case R.id.activity_dialog_rad6:
                shortToast("You chose number 6.");
                break;
            case R.id.activity_dialog_rad7:
                shortToast("You chose number 7.");
                break;
            case R.id.activity_dialog_rad8:
                shortToast("You chose number 8.");
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }
}
