package com.example.my_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.io.Console;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflator;
    String[] Console;
    String[] Price;
    String[] Developer;

    public ItemAdapter(Context c,String[] i, String[] p, String[] d){
        Console = i;
        Price = p;
        Developer = d;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return Console.length;
    }

    @Override
    public Object getItem(int i) {
        return Console[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflator.inflate(R.layout.my_listview_detail,null);
        TextView consoleTextView = (TextView) v.findViewById(R.id.consoleTextView);
        TextView developerTextView = (TextView) v.findViewById(R.id.developerTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String console = Console[i];
        String dev = Developer[i];
        String cost = Price[i];

        consoleTextView.setText(console);
        developerTextView.setText(dev);
        priceTextView.setText(cost);
        return v;
    }
}
