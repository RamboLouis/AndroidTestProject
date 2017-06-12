package com.example.rambolu.androidactivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

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
        animalDate = new LinkedList<>();
        animalDate.add(new Animal("主题1","副标题1", R.mipmap.icon1));
        animalDate.add(new Animal("主题2","副标题2", R.mipmap.icon2));
        animalDate.add(new Animal("主题3","副标题3", R.mipmap.icon3));
        animalDate.add(new Animal("主题4","副标题4", R.mipmap.icon4));
        animalDate.add(new Animal("主题5","副标题5", R.mipmap.icon5));
        animalDate.add(new Animal("主题6","副标题6", R.mipmap.icon6));
        animalDate.add(new Animal("主题7","副标题7", R.mipmap.icon7));
        animalAdapter = new AnimalAdapter(animalDate,animalContext);
        animalList.setAdapter(animalAdapter);

    }
}
