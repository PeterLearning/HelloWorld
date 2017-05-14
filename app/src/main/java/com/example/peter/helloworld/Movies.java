package com.example.peter.helloworld;

/**
 * Created by Peter on 2017/5/14.
 */

public class Movies {

    private String nm;

    private String dir;

    private String star;

    private String cat;

    private int imgId;

    public Movies(String nm, String dir, String star, String cat, int imgId) {
        this.nm = nm;
        this.dir = dir;
        this.star = star;
        this.cat = cat;
        this.imgId = imgId;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
