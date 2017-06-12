package com.example.rambolu.androidactivity.ListActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rambolu.androidactivity.R;

import java.util.LinkedList;

/**
 * Created by RamboLu on 2017/6/12.
 */
public class AnimalAdapter extends BaseAdapter {

    private LinkedList<Animal> animalData;
    private Context animalContext;

    public AnimalAdapter(LinkedList<Animal> animalData, Context animalContext) {
        this.animalData = animalData;
        this.animalContext = animalContext;
    }

    @Override
    public int getCount() {
        return animalData.size();
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
        convertView = LayoutInflater.from(animalContext).inflate(R.layout.list_item_animal,parent,false);
        ImageView img_icon = (ImageView)convertView.findViewById(R.id.listAnimalImageView);
        TextView name_text = (TextView)convertView.findViewById(R.id.listAnimalMainName);
        TextView subName_text = (TextView)convertView.findViewById(R.id.listAnimalSubName);
        img_icon.setImageResource(animalData.get(position).getIcons());
        name_text.setText(animalData.get(position).getNames());
        subName_text.setText(animalData.get(position).getSpeaks());
        return convertView;
    }
}
