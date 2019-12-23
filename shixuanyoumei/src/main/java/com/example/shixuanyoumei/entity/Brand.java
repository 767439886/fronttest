package com.example.shixuanyoumei.entity;

public class Brand {

    private Integer id ;
    private String name ;
    private String context ;
    private String telephone ;
    private String picPath ;
    private String type ;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getPicPath() {
        return picPath;
    }
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
