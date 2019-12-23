package com.example.shixuanyoumei.entity;

public class Shopping {

    private Integer id ;
    private String picpath ;
    private String main ;
    private String content ;
    private Double price ;
    private Integer type ;
    private String consitute ;
    private Double originalPrice ;

    //  封装用户的数量
    private String number ;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getConsitute() {
        return consitute;
    }
    public void setConsitute(String consitute) {
        this.consitute = consitute;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPicpath() {
        return picpath;
    }
    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }
    public String getMain() {
        return main;
    }
    public void setMain(String main) {
        this.main = main;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
}
