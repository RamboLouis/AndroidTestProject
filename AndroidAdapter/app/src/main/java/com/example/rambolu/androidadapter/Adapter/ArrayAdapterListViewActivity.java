package com.example.rambolu.androidadapter.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rambolu.androidadapter.Base.BaseActivity;
import com.example.rambolu.androidadapter.R;

import java.util.ArrayList;

public class ArrayAdapterListViewActivity extends BaseActivity {

    private ListView listView;
    ArrayList<String> strArr;
    ArrayAdapter arrayAdapter;
    int listNum = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_list_view);
        setArrayAdapterUI();
    }

    void setArrayAdapterUI(){
        strArr = new ArrayList<>();
        for (int i = 1; i <= listNum; i++) {
            strArr.add("测试"+i);
        }

        // 纯文字列表
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strArr);
        // 纯文字列表（加高）
//        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,strArr);
        // 加一个对号选项
//        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_checked,strArr);
        // 加一个原点选项
//        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,strArr);
        // 加一个方块选项
//        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,strArr);
        listView = (ListView)findViewById(R.id.arrayAdapterListView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "你点击了第" + position + "项");
                startActivity(new Intent(ArrayAdapterListViewActivity.this,SimpleAdapterListViewActivity.class));
            }
        });
    }
}
