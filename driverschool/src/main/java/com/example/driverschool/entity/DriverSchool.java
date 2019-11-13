package com.example.driverschool.entity;

public class DriverSchool {

    private int id ;
    private String name ;
    private String centage ;
    private int teachQuality ;
    private String learnPeople ;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCentage() {
        return centage;
    }
    public void setCentage(String centage) {
        this.centage = centage;
    }
    public int getTeachQuality() {
        return teachQuality;
    }
    public void setTeachQuality(int teachQuality) {
        this.teachQuality = teachQuality;
    }
    public String getLearnPeople() {
        return learnPeople;
    }
    public void setLearnPeople(String learnPeople) {
        this.learnPeople = learnPeople;
    }
}
