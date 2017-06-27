package com.example.rambolu.androidadapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rambolu.androidadapter.Activity.ArrayAdapterListViewActivity;
import com.example.rambolu.androidadapter.Activity.CustomBaseAdapterListViewActivity;
import com.example.rambolu.androidadapter.Activity.SimpleAdapterListViewActivity;
import com.example.rambolu.androidadapter.Base.BaseActivity;


public class MainActivity extends BaseActivity {

    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    void setUI(){
        btn1 = (Button)findViewById(R.id.mainButton1);
        btn1.setText("ArrayAdapterListView");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ArrayAdapterListViewActivity.class));
            }
        });

        btn2 = (Button)findViewById(R.id.mainButton2);
        btn2.setText("SimpleAdapterListView");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SimpleAdapterListViewActivity.class));
            }
        });

        btn3 = (Button)findViewById(R.id.mainButton3);
        btn3.setText("CustomBaseAdapterListView");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomBaseAdapterListViewActivity.class));
            }
        });

    }
}
