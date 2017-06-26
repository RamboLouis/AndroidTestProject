package com.example.rambolu.androidadapter.Activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rambolu.androidadapter.Adapter.CustomBaseAdapter;
import com.example.rambolu.androidadapter.Base.BaseActivity;
import com.example.rambolu.androidadapter.Model.CustomListViewModel;
import com.example.rambolu.androidadapter.R;

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
        context = CustomBaseAdapterListViewActivity.this;
        listView = (ListView)findViewById()

    }
}
