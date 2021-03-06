package com.example.jaredgoldman.jared2017summer;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SharedPreferenceActivity extends BaseActivity {

    @BindView(R.id.activity_sharedprefs_email)
    EditText emailEditText;
    @BindView(R.id.activity_sharedprefs_pass)
    EditText passEditText;

    @OnClick(R.id.activity_sharedprefs_login)
    public void login(View v) {
        String email = emailEditText.getText().toString();
        String password = passEditText.getText().toString();
        if(check(email,password)) {
            shortToast("Login success");
        }
    }
    private final String EMAIL = "email";
    private final String PASSWORD = "password";
    private final String USER = "user";

    @OnClick(R.id.activity_sharedprefs_clear)
    public void clear(View v) {
        SharedPreferences sp = getSharedPreferences("USER",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.remove("EMAIL");
        editor.remove("PASSWORD");
        editor.commit();
        emailEditText.setText("");
        passEditText.setText("");
        shortToast("You fucking deleted it. GG no re.");
    }


    private boolean check(String email, String password) {
        //ignore check
        boolean passCorrect = true;
        if(passCorrect) {
            SharedPreferences sp = getSharedPreferences("USER", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("EMAIL",email);
            editor.putString("PASSWORD",password);
            editor.commit();
            return true;
        } else return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        ButterKnife.bind(this);
        retrieveLoginInfo();
    }

    private void retrieveLoginInfo() {
        SharedPreferences sp = getSharedPreferences("USER", MODE_PRIVATE);
        String email = sp.getString("EMAIL","null");
        String password = sp.getString("PASSWORD","null");
        if(!email.equals("null")) {
            emailEditText.setText(email);
            passEditText.setText(password);
        }
    }
}
