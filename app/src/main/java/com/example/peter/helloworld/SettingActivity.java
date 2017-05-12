package com.example.peter.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingActivity extends AppCompatActivity {

    //设置界面
    private String[] data = {
            "意见反馈",
            "给应用评分",
            "清除缓存",
            "关于"};
    //设置界面

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //设置界面监听器
        ArrayAdapter<String > adapter = new ArrayAdapter<String>(
                SettingActivity.this, android.R.layout.simple_list_item_1,data
        );
        ListView listView=(ListView) findViewById(R.id.shezhi);
        listView.setAdapter(adapter);
        //设置界面监听器


    }
}
