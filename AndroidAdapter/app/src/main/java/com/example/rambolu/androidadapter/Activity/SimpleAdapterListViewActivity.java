package com.example.rambolu.androidadapter.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.rambolu.androidadapter.Base.BaseActivity;
import com.example.rambolu.androidadapter.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterListViewActivity extends BaseActivity {

    String[] names = new String[]{
        "测试1",
        "测试2",
        "测试3",
        "测试4",
        "测试5",
        "测试6"};
    String[] subNames = new String[]{
            "我就是子标题1",
            "我就是子标题2",
            "我就是子标题3",
            "我就是子标题4",
            "我就是子标题5",
            "我就是子标题6"};
    String[] subNames2 = new String[]{
            "子标题1",
            "子标题2",
            "子标题3",
            "子标题4",
            "子标题5",
            "子标题6"};
    int[] icons = new int[]{
            R.mipmap.icon1,
            R.mipmap.icon2,
            R.mipmap.icon3,
            R.mipmap.icon4,
            R.mipmap.icon5,
            R.mipmap.icon6};
    private ListView listView;
    SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_list_view);
        setArrayAdapterUI();
    }

    void setArrayAdapterUI() {
        List<Map<String,Object>> listItems = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            Map<String,Object> item = new HashMap<>();
            item.put("icon",icons[i]);
            item.put("name",names[i]);
            item.put("subName",subNames[i]);
            item.put("subIcon",icons[i]);
            item.put("subNames2",subNames2[i]);
            listItems.add(item);
        }
        simpleAdapter = new SimpleAdapter(
                this,
                listItems,
                R.layout.layout_item,
                new String[]{"icon","name","subName","subIcon","subNames2"},
                new int[]{R.id.imageView, R.id.textView, R.id.textView2, R.id.imageView2, R.id.textView3});
        listView = (ListView)findViewById(R.id.simpleAdapterListView);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onItemClick:"+position);
                startActivity(new Intent(SimpleAdapterListViewActivity.this,ArrayAdapterListViewActivity.class));
            }
        });
    }
}
