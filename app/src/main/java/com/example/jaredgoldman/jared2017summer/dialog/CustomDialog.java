package com.example.jaredgoldman.jared2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.jaredgoldman.jared2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jaredgoldman on 6/21/17.
 */

public class CustomDialog extends Dialog {

    private final ICutsomDialogListener listener;

    public interface ICutsomDialogListener {
        public void onOKClicked(String msg);
        //public void onCancelClicked();
        /*next inclass quiz is custom dialog*/
    }



    @OnClick(R.id.dialog_custom_ok)
    public void ok(View view) {
        listener.onOKClicked("You clicked OK");
        cancel();
    }

    public CustomDialog(@NonNull Context context, ICutsomDialogListener listener) {
        super(context,R.style.dialog);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}
