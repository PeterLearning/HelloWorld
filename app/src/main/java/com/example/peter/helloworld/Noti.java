package com.example.peter.helloworld;

/**
 * Created by Peter on 2017/5/15.
 */

public class Noti {
    private String notiTitle;
    private String notiInfo;
    private String notiAuth;
    private int notiImg;

    public Noti(String notiTitle, String notiInfo, String notiAuth, int notiImg) {
        this.notiTitle = notiTitle;
        this.notiInfo = notiInfo;
        this.notiAuth = notiAuth;
        this.notiImg = notiImg;
    }

    public String getNotiTitle() {
        return notiTitle;
    }

    public void setNotiTitle(String notiTitle) {
        this.notiTitle = notiTitle;
    }

    public String getNotiInfo() {
        return notiInfo;
    }

    public void setNotiInfo(String notiInfo) {
        this.notiInfo = notiInfo;
    }

    public String getNotiAuth() {
        return notiAuth;
    }

    public void setNotiAuth(String notiAuth) {
        this.notiAuth = notiAuth;
    }

    public int getNotiImg() {
        return notiImg;
    }

    public void setNotiImg(int notiImg) {
        this.notiImg = notiImg;
    }
}
