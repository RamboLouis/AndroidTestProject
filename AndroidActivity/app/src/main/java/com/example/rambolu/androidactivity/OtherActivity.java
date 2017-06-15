package com.example.rambolu.androidactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OtherActivity extends BaseActivity {

    Button otherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Log.d(TAG, "OtherActivity-->onCreate");
        setClickBtn();
    }

    void setClickBtn() {
        otherButton = (Button) findViewById(R.id.otherButton);
        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherActivity.this,ImageActivity.class);
                startActivityForResult(intent,100);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        String requestCodeStr = String.valueOf(requestCode);
//        String resultCodeStr = String.valueOf(resultCode);
        Log.d(TAG, "requestCode----->" + requestCode);
        Log.d(TAG, "resultCode--->" + resultCode);

        if (resultCode == 200){
            Bundle bundle = data.getExtras();
            int imgId = bundle.getInt("imgId");
            Log.d(TAG, "imgId---->" + imgId);
            ImageView imageView = (ImageView)findViewById(R.id.otherImageView);
            imageView.setImageResource(imgId);
        }
    }
}
