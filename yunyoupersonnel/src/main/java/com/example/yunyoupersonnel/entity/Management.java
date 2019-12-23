package com.example.yunyoupersonnel.entity;

public class Management {

    private Integer id ;
    private String updateDate ;
    private Integer uid ;
    private String level ;
    private String upPerson ;
    private String position ;

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getUpPerson() {
        return upPerson;
    }
    public void setUpPerson(String upPerson) {
        this.upPerson = upPerson;
    }
}
