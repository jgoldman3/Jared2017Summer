package com.example.jaredgoldman.jared2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.jaredgoldman.jared2017summer.dialog.CustomDialog;

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
                CustomDialog customDialog =
                        new CustomDialog(this, new CustomDialog.ICutsomDialogListener() {
                            @Override
                            public void onOKClicked(String msg) {
                                shortToast(msg);
                            }
                        });
                customDialog.setCanceledOnTouchOutside(true);
                customDialog.show();
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

    private void normalDialog() {
        //TODO: read/watch the video. button 1
    }

    private void listDialog() {
        //TODO: same as normal. button 2
    }

    private void singleChoiceDialog() {
        //TODO: same as normal. button 3
    }

    private void multiChoiceDialog() {
        //TODO: same as normal. button 4
    }

    private void waitingDialog() {
        //TODO: same as normal. button 5
    }

    private void progressDialog() {
        //TODO: same as normal. button 6
        
    }

    private void inputDialog() {
        //TODO: same as normal. button 7
    }
}
