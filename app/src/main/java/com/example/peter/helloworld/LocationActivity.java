package com.example.peter.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LocationActivity extends AppCompatActivity {

    //设置界面
    private String[] data = {
            "A","安徽", "澳门",
            "B","北京",
            "C","重庆",
            "F","福建",
            "G","甘肃","广东","广西","贵州",
            "H","海南","河北","黑龙江","河南","香港","湖北","湖南",
            "J","江苏","江西","吉林",
            "L","辽宁",
            "N","内蒙古","宁夏",
            "Q","青海",
            "S","陕西","山西","山东","上海","四川",
            "T","台湾","天津","新疆","西藏",
            "X","新疆","西藏",
            "Y","云南",
            "Z","浙江",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        ArrayAdapter<String > adapter = new ArrayAdapter<String>(
                LocationActivity.this, android.R.layout.simple_list_item_1,data
        );
        ListView listView=(ListView) findViewById(R.id.DingWei);
        listView.setAdapter(adapter);
    }

}

