package com.example.rambolu.androidactivity;

import android.os.Bundle;
import android.util.Log;

public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.d(TAG, "TestActivity--->onCreate");
    }
}
