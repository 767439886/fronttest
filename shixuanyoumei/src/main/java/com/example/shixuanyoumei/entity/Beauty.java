package com.example.shixuanyoumei.entity;

public class Beauty {

    private Integer id ;
    private String picPath ;
    private String context ;
    private String smallContext ;
    private String city ;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPicPath() {
        return picPath;
    }
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public String getSmallContext() {
        return smallContext;
    }
    public void setSmallContext(String smallContext) {
        this.smallContext = smallContext;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
