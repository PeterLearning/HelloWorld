package com.example.peter.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CinemaActivity extends AppCompatActivity {

    private List<Weeks> weeksList = new ArrayList<>();

    private List<Cinema> cinemaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);
        initWeeks();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.weeks_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        WeeksAdapter adapter = new WeeksAdapter(weeksList);
        recyclerView.setAdapter(adapter);

        initCinema();
        CinemaAdapter adapter_cinema = new CinemaAdapter(CinemaActivity.this,
                R.layout.cinema_item, cinemaList);
        ListView listView = (ListView) findViewById(R.id.cinema_list_view);
        listView.setAdapter(adapter_cinema);
    }
    private void initWeeks() {
        Weeks mon = new Weeks("05.15周一(今天)");
        Weeks twu = new Weeks("05.16周二(明天)");
        Weeks wen = new Weeks("05.17周三(后天)");
        Weeks thi = new Weeks("05.18周四");
        Weeks fri = new Weeks("05.19周五");
        Weeks sat = new Weeks("05.20周六");
        Weeks sun = new Weeks("05.21周日");
        weeksList.add(mon);
        weeksList.add(twu);
        weeksList.add(wen);
        weeksList.add(thi);
        weeksList.add(fri);
        weeksList.add(sat);
        weeksList.add(sun);
    }

    private void initCinema() {
        Cinema a = new Cinema("临安影视城","24元起","今日余4场 近期场次17:50","3.2km");
        Cinema b = new Cinema("杭州泽艺影城","38元起","今日余3场 近期场次19:10","20.8km");
        Cinema c = new Cinema("富阳横店电影城","34元起","今日余5场 近期场次18:00","30.6km");
        Cinema d = new Cinema("富阳时代电影大世界","33元起","今日余6场 近期场次18:50","32.2km");
        Cinema e = new Cinema("保利国际影城","24元起","今日余4场 近期场次17:50","34.9km");
        Cinema f = new Cinema("杭州转塘时代电影大世界影城","24元起","今日余4场 近期场次17:50","37.2km");
        Cinema g = new Cinema("杭州奇奢华影城","24元起","今日余4场 近期场次17:50","37.km");
        Cinema h = new Cinema("杭州金象影城","24元起","今日余4场 近期场次17:50","38.8km");
        Cinema i = new Cinema("杭州光影影城","24元起","今日余4场 近期场次17:50","41.2km");
        Cinema j = new Cinema("杭州时代联合","24元起","今日余4场 近期场次17:50","41.3km");
        cinemaList.add(a);
        cinemaList.add(b);
        cinemaList.add(c);
        cinemaList.add(d);
        cinemaList.add(e);
        cinemaList.add(f);
        cinemaList.add(g);
        cinemaList.add(h);
        cinemaList.add(i);
        cinemaList.add(j);
    }
}
