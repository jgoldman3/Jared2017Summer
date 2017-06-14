package com.example.jaredgoldman.jared2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;

public class ActivityA extends AppCompatActivity {
/*HOMEWORK 2:
* TODO: make Activity B,C,D
* TODO: make layout files
* TODO: assign to demo case 6*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }
}
