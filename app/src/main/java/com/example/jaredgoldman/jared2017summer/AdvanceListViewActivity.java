package com.example.jaredgoldman.jared2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jaredgoldman.jared2017summer.adapter.AdvanceListViewAdapter;

import java.util.ArrayList;

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
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I am fine, thank you!");
        list.add("Hi, how are you?");
        list.add("Hi");
        list.add("Hi, how are you?");
        list.add("Hi");
        list.add("Hi, how are you?");
        list.add("Hi");
        list.add("Hi, how are you?");
        list.add("Hi, how are you?");
        list.add("Hi, how are you?");
        list.add("Hi, how are you?");
        list.add("Hi, how are you?");
        list.add("Hi, how are you?");

        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);

    }
}
