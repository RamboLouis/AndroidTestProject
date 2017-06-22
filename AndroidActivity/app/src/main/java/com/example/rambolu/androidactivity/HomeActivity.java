package com.example.rambolu.androidactivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {

    String[] strs = {"小学","中学","高中","本科","硕士","博士"};

    String[] name = new String[]{
            "测试1",
            "测试2",
            "测试3",
            "测试4",
            "测试5",
            "测试6",};
    String[] subName = new String[]{
            "我就是子标题1",
            "我就是子标题2",
            "我就是子标题3",
            "我就是子标题4",
            "我就是子标题5",
            "我就是子标题6"};

    int[] imgId = new int[]{
            R.mipmap.icon1,
            R.mipmap.icon2,
            R.mipmap.icon3,
            R.mipmap.icon4,
            R.mipmap.icon5,
            R.mipmap.icon6};
    ListView homeListView;
    ArrayAdapter arrayAdapter;
    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setArrayAdapter();
        setSimpleAdapter();
    }

    void setArrayAdapter() {
        // 单独一行的文本框
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strs);
        homeListView = (ListView)findViewById(R.id.homeListView);
        homeListView.setAdapter(arrayAdapter);
    }

    void setSimpleAdapter() {
        //List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> listitem = new ArrayList();
        for (int i = 0; i < name.length; i++) {
            //Map<String, Object> showitem = new HashMap<String, Object>();
            Map<String, Object> showitem = new HashMap();
            showitem.put("icon", imgId[i]);
            showitem.put("name", name[i]);
            showitem.put("subName", subName[i]);
            listitem.add(showitem);
        }
        simpleAdapter = new SimpleAdapter(
                this,
                listitem,
                R.layout.list_item,
                new String[]{"icon","name","subName"},
                new int[]{R.id.listImageView, R.id.listMainName, R.id.listSubName});
        homeListView = (ListView)findViewById(R.id.homeSimpleListView);
        homeListView.setAdapter(simpleAdapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityB--->onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityB--->onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityB--->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityB--->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityB--->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityB--->onDestroy");
    }
}
