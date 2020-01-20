package com.rick.javavskotlinfortuan.java.vo;

import java.io.Serializable;

public class MyData implements Serializable {
    private static final long serialVersionUID = MyData.class.hashCode();

    private String title;
    private String date;
    private String ps;
    private int productIdx;
    private int productPic;
    private String productName;
    private long currentTime;
    private String tag;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public int getProductIdx() {
        return productIdx;
    }

    public void setProductIdx(int productIdx) {
        this.productIdx = productIdx;
    }

    public int getProductPic() {
        return productPic;
    }

    public void setProductPic(int productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public MyData(String title, String date, String ps,
                  int productIdx, int productPic, String productName, long currentTime, String tag) {
        this.title = title;
        this.date = date;
        this.ps = ps;
        this.productIdx = productIdx;
        this.productPic = productPic;
        this.productName = productName;
        this.currentTime = currentTime;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", ps='" + ps + '\'' +
                ", productIdx=" + productIdx +
                ", productPic=" + productPic +
                ", productName='" + productName + '\'' +
                ", currentTime=" + currentTime +
                ", tag='" + tag + '\'' +
                '}';
    }
}
