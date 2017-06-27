package com.example.rambolu.androidadapter.Activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rambolu.androidadapter.Adapter.CustomBaseAdapter;
import com.example.rambolu.androidadapter.Base.BaseActivity;
import com.example.rambolu.androidadapter.Model.CustomListViewModel;
import com.example.rambolu.androidadapter.R;

import java.util.LinkedList;
import java.util.List;

public class CustomBaseAdapterListViewActivity extends BaseActivity {
    private List<CustomListViewModel> listViewModels;
    private CustomBaseAdapter customBaseAdapter;

    private Context context;
    private ListView listView;

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
        setContentView(R.layout.activity_custom_base_adapter_list_view);
        setUI();
    }

    void setUI(){
        listViewModels = new LinkedList<>();
        context = CustomBaseAdapterListViewActivity.this;
        listView = (ListView)findViewById(R.id.customListView);
        for (int i = 0; i < icons.length; i++) {
            listViewModels.add(new CustomListViewModel(
                    icons[i],
                    "主标题"+(i+1),
                    "副标题"+(i+1),
                    "子标题"+(i+1))
            );
        }
        Log.d(TAG, ""+icons.length);
        customBaseAdapter = new CustomBaseAdapter((LinkedList<CustomListViewModel>)listViewModels,context);

        listView.setAdapter(customBaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context,"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context,"你长按了第" + position + "项",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
