package com.example.rambolu.androidactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageActivity extends BaseActivity {

    public int[] imgs = new int[] {
            R.mipmap.icon1,
            R.mipmap.icon2,
            R.mipmap.icon3,
            R.mipmap.icon4,
            R.mipmap.icon5,
            R.mipmap.icon6,
            R.mipmap.icon7,
            R.mipmap.icon8,
            R.mipmap.icon9,
            R.mipmap.icon10};

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        setUI();
    }

    void setUI() {
        gridView = (GridView)findViewById(R.id.ImageAvtivityGridView);
        gridView.setBackgroundColor(Color.parseColor("#f34649"));
        BaseAdapter baseAdapter = new BaseAdapter() {
            // 获得数量
            @Override
            public int getCount() {
                Log.d(TAG, "getCount--->" + imgs.length);
                return imgs.length;
            }

            // 获得当前选项
            @Override
            public Object getItem(int position) {
                Log.d(TAG, "getItem--->" + position);
                return position;
            }

            //获得当前选项对应的id
            @Override
            public long getItemId(int position) {
                Log.d(TAG, "getItemId--->" + position);
                return position;
            }

            //获取对应的view
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                //Log.d(TAG, "getView--->position:" + position + "--->convertView:" + convertView + "--->parent:" + parent);
                ImageView imageView;
                if (convertView == null){
                    imageView = new ImageView(ImageActivity.this);
                    imageView.setAdjustViewBounds(true);
                    imageView.setMaxWidth(200);
                    imageView.setMaxHeight(200);
                    imageView.setPadding(5,5,5,5);
                } else {
                    imageView = (ImageView)convertView;
                }
                imageView.setImageResource(imgs[position]);
                return imageView;
            }
        };
        Log.d(TAG, "setAdapter--->");
        gridView.setAdapter(baseAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                Log.d(TAG, "position----->" + position);
                Log.d(TAG, "imgs[position]----->" + imgs[position]);
                bundle.putInt("imgId",imgs[position]);
                intent.putExtras(bundle);
                setResult(200,intent);
                finish();
            }
        });

    }
}
