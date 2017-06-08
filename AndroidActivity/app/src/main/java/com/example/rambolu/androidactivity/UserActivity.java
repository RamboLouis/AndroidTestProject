package com.example.rambolu.androidactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UserActivity extends BaseActivity {

    TextView txtshow,txtshow1;
    String name,sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Log.d(TAG, "UserActivity---->onCreate");
        getBundle();
    }

    void getBundle() {
        txtshow = (TextView)findViewById(R.id.userTextView);
        txtshow1 = (TextView)findViewById(R.id.userTextView1);
        Intent getIntent = getIntent();

        // 一次取一个
        //name = getIntent.getStringExtra("name");
        // 一次取多个
        Bundle bd = getIntent.getExtras();
        name = bd.getCharSequence("name").toString();
        sex = bd.getCharSequence("sex").toString();
        //**************
        txtshow.setText(name);
        txtshow1.setText(sex);
    }
}
