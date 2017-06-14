package com.example.jaredgoldman.jared2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends AppCompatActivity {


    @BindView(R.id.activity_advance_list_view)
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        ButterKnife.bind(this);
    }
}
