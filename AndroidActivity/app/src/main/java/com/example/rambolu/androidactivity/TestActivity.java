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

        //动态加载顶部View和底部View
        LayoutInflater inflater = LayoutInflater.from(this);
        View headView = inflater.inflate(R.layout.view_header, null, false);
        View footView = inflater.inflate(R.layout.view_footer, null, false);

        animalDate = new LinkedList<>();
        animalDate.add(new Animal("主题1","副标题1", R.mipmap.icon1));
        animalDate.add(new Animal("主题2","副标题2", R.mipmap.icon2));
        animalDate.add(new Animal("主题3","副标题3", R.mipmap.icon3));
        animalDate.add(new Animal("主题4","副标题4", R.mipmap.icon4));
        animalDate.add(new Animal("主题5","副标题5", R.mipmap.icon5));
        animalDate.add(new Animal("主题6","副标题6", R.mipmap.icon6));
        animalDate.add(new Animal("主题7","副标题7", R.mipmap.icon7));
        animalDate.add(new Animal("主题8","副标题8", R.mipmap.icon8));
        animalDate.add(new Animal("主题9","副标题9", R.mipmap.icon9));
        animalDate.add(new Animal("主题10","副标题10", R.mipmap.icon10));
        animalAdapter = new AnimalAdapter((LinkedList<Animal>) animalDate,animalContext);

        // 添加表头表尾需要卸载set方法
        animalList.addHeaderView(headView);
        animalList.addFooterView(footView);

        // 隐藏滚动条
        animalList.setVerticalScrollBarEnabled(true);

        animalList.setAdapter(animalAdapter);
        animalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(animalContext,"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
