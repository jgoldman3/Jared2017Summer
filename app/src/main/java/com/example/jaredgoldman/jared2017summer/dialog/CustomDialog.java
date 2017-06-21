package com.example.jaredgoldman.jared2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by jaredgoldman on 6/21/17.
 */

public class CustomDialog extends Dialog {

    public CustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_custom);
    }
}
