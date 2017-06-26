package com.example.rambolu.androidactivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.rambolu.androidactivity.ListActivity.Animal;
import com.example.rambolu.androidactivity.ListActivity.AnimalAdapter;

import java.util.LinkedList;
import java.util.List;

public class TestActivity extends BaseActivity {

    private List<Animal> animalDate;
    private Context animalContext;
    private AnimalAdapter animalAdapter;
    private ListView animalList;

    private int[] icons = new int[] {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.d(TAG, "TestActivity--->onCreate");
        setUI();
    }


    void setUI() {
        animalContext = TestActivity.this;
        animalList = (ListView)findViewById(R.id.testListView);

        // 动态加载顶部View和底部View
        LayoutInflater inflater = LayoutInflater.from(this);
        View headView = inflater.inflate(R.layout.view_header, null, false);
        View footView = inflater.inflate(R.layout.view_footer, null, false);

        animalDate = new LinkedList<>();
        Log.d(TAG, "图片数组常长度"+icons.length);
        for (int i = 0; i < icons.length; i++) {
            animalDate.add(new Animal("主题"+(i+1),"副标题"+(i+1),icons[i]));
        }

        for (int icon : icons){
            Log.d(TAG, "icon图片："+icon);
        }

        animalAdapter = new AnimalAdapter((LinkedList<Animal>) animalDate,animalContext);

        // 添加表头表尾需要卸载set方法
        animalList.addHeaderView(headView);
        animalList.addFooterView(footView);

        // 隐藏滚动条
        animalList.setVerticalScrollBarEnabled(true);

        animalList.setAdapter(animalAdapter);

        /*
         * 单击item点击事件
         */
        animalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(animalContext,"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
            }
        });

        /*
         * 长按item点击事件
         */
        animalList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(animalContext,"你长按了第" + position + "项",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }


}
