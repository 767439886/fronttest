package com.example.driverschool.entity;

public class Userdriverschool {

    private int id ;
    private String schoolName ;
    private double price ;
    private String className ;
    private String exercisePlace ;
    private String username ;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getExercisePlace() {
        return exercisePlace;
    }
    public void setExercisePlace(String exercisePlace) {
        this.exercisePlace = exercisePlace;
    }
}
