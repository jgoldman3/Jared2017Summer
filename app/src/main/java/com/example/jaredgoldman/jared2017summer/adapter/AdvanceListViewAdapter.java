package com.example.jaredgoldman.jared2017summer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import com.example.jaredgoldman.jared2017summer.R;

import java.util.ArrayList;

/**
 * Created by jaredgoldman on 6/14/17.
 */

public class AdvanceListViewAdapter extends BaseAdapter {

    private final Context context;
    private final LayoutInflater inflater;
    private ArrayList<String> list;

    public AdvanceListViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_normal_item,parent,false);
        RelativeLayout rl_odd = (RelativeLayout)convertView.findViewById(R.id.odd);
        RelativeLayout rl_even = (RelativeLayout)convertView.findViewById(R.id.even);
        return convertView;
    }
}
