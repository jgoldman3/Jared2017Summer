package com.example.jaredgoldman.jared2017summer.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jaredgoldman.jared2017summer.R;

import butterknife.OnClick;

public class WorkFragment extends Fragment {

    @OnClick(R.id.fragment_work_submit)
    public void submit(View v) {
        Toast.makeText(WorkFragment.this.getContext(), "You clicked submit", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_work, container, false);
    }

}
