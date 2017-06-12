package com.example.rambolu.androidactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    Button mainButton,mainButton1,mainButton2,mainButton3,mainButton4;
    EditText mainEditText,mainEditText1;
    String name,sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity--->onCreate");
        this.clickBtn();

        // create our manager instance after the content view is set
//        SystemBarTintManager tintManager = new SystemBarTintManager(this);
//        // enable status bar tint
//        tintManager.setStatusBarTintEnabled(true);
//        // enable navigation bar tint
//        tintManager.setNavigationBarTintEnabled(true);
////        tintManager.setTintColor(Color.parseColor("#99000FF"));
//        tintManager.setTintColor(Color.parseColor("#99000FF"));
//        Window window = getWindow();
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.setStatusBarColor(getResources().getColor(R.color.black));
    }

    void clickBtn() {
        TextView textView = (TextView) findViewById(R.id.mainTextView);
        textView.setText("MainActivity");

        mainButton = (Button) findViewById(R.id.mainButton);
        mainButton.setText("按钮1");
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "MainActivity-->Btn1点击方法");
                // Intent 显示方法  HomeActivity
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        mainButton1 = (Button) findViewById(R.id.mainButton1);
        mainButton1.setText("按钮2");
        mainButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "MainActivity-->Btn2点击方法");
                // Intent 隐式调用  OtherActivity
                Intent otherIntent = new Intent();
                otherIntent.setAction("other_action");
                otherIntent.addCategory("other_category");
                startActivity(otherIntent);
            }
        });

        mainButton2 = (Button) findViewById(R.id.mainButton2);
        mainButton2.setText("按钮3");
        mainButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "MainActivity-->Btn3点击方法");
                // Intent 调用系统Activity
                // 1.打电话
                Uri uri = Uri.parse("tel:10010");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
                // 2. 发短信
//                Uri uri = Uri.parse("sms:10010");
//                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
//                intent.putExtra("sms_body", "今天天气不错");
//                startActivity(intent);
                // 3. 打开浏览器
//                Uri uri = Uri.parse("http://www.baidu.com");
//                Intent intent  = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
            }
        });

        mainButton3 = (Button)findViewById(R.id.mainButton3);
        mainButton3.setText("按钮3");
        mainButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TestActivity.class));
            }
        });


        mainEditText = (EditText)findViewById(R.id.mainEditText);
        mainEditText1 = (EditText)findViewById(R.id.mainEditText1);

        mainButton4 = (Button) findViewById(R.id.mainButton4);
        mainButton4.setText("确定");

        mainButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = mainEditText.getText().toString();
                sex = mainEditText1.getText().toString();
                Intent intent = new Intent(MainActivity.this, UserActivity.class);

                // 一次传一个
                // intent.putExtra("name",name);

                // 一次传多条数据
                Bundle bd = new Bundle();
                bd.putCharSequence("name",name);
                bd.putCharSequence("sex",sex);
                intent.putExtras(bd);
                // ******************
                startActivity(intent);
                //finish();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity--->onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity--->onStart");
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity--->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity--->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity--->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity--->onDestroy");
    }
}
