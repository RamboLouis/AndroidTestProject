package com.example.rambolu.androidadapter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rambolu.androidadapter.Model.CustomListViewModel;
import com.example.rambolu.androidadapter.R;

import java.util.LinkedList;

/**
 * 作者：RamboLu 创建时间 2017/6/23 17:53
 */

public class CustomBaseAdapter extends BaseAdapter {

    private LinkedList<CustomListViewModel> listViewModel;
    private Context context;

    public CustomBaseAdapter(LinkedList<CustomListViewModel> listViewModel,Context context){
        this.listViewModel = listViewModel;
        this.context = context;
    }

    public CustomBaseAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return listViewModel.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.list_view_item,parent,false);
        ImageView icon = (ImageView)convertView.findViewById(R.id.customImageView);
        TextView name = (TextView)convertView.findViewById(R.id.customTextView);
        TextView subName = (TextView)convertView.findViewById(R.id.textView2);
        TextView minName = (TextView)convertView.findViewById(R.id.customTextView3);
        icon.setImageResource(listViewModel.get(position).getIcon());
        name.setText(listViewModel.get(position).getName());
        subName.setText(listViewModel.get(position).getSubName());
        minName.setText(listViewModel.get(position).getMinName());
        return convertView;
    }
}
