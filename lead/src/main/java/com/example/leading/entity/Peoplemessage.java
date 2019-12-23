package com.example.leading.entity;

public class Peoplemessage implements java.io.Serializable{

    private String nativePlace ;
    private String area ;
    private Integer id ;
    private String birthday ;
    private String sex ;
    private String edu ;
    private String name ;

    //  任职的范围
    private String province ;
    private String city ;
    private String areas ;
    //  籍贯区域范围
    private String sprovince ;
    private String scity ;
    private String sareas ;

    private String profession ;
    private String duty ;
    private String politics ;
    private String school ;
    private String branch ;
    //  任职区域
    private String brandAread ;

    public String getBrandAread() {
        return brandAread;
    }

    public void setBrandAread(String brandAread) {
        this.brandAread = brandAread;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getSprovince() {
        return sprovince;
    }

    public void setSprovince(String sprovince) {
        this.sprovince = sprovince;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public String getSareas() {
        return sareas;
    }

    public void setSareas(String sareas) {
        this.sareas = sareas;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
