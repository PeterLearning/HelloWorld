package com.example.peter.helloworld;

/**
 * Created by Peter on 2017/5/15.
 */

public class Cinema {
    private String cinName;
    private String cinMoney;
    private String cinInfo;
    private String cinDistance;

    public Cinema(String cinName, String cinMoney, String cinInfo, String cinDistance) {
        this.cinName = cinName;
        this.cinMoney = cinMoney;
        this.cinInfo = cinInfo;
        this.cinDistance = cinDistance;
    }

    public String getCinName() {
        return cinName;
    }

    public String getCinMoney() {
        return cinMoney;
    }

    public String getCinInfo() {
        return cinInfo;
    }

    public String getCinDistance() {
        return cinDistance;
    }
}
