package com.example.rambolu.androidactivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends BaseActivity {

    String[] strs = {"小学","中学","高中","本科","硕士","博士"};
    ListView homeListView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setListView();
    }

    void setListView() {
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strs);
        homeListView = (ListView)findViewById(R.id.homeListView);
        homeListView.setAdapter(adapter);
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
