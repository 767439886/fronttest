package com.example.yunyoupersonnel.entity;

public class Culitivate {

    private Integer id ;
    private String cultivateName ;
    private String cultivateCenter ;
    private String startDate ;
    private String endDate ;
    private String culitivateCompany ;
    private String culitivateResult ;
    private Integer uid ;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Culitivate() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCultivateName() {
        return cultivateName;
    }
    public void setCultivateName(String cultivateName) {
        this.cultivateName = cultivateName;
    }
    public String getCultivateCenter() {
        return cultivateCenter;
    }
    public void setCultivateCenter(String cultivateCenter) {
        this.cultivateCenter = cultivateCenter;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getCulitivateCompany() {
        return culitivateCompany;
    }
    public void setCulitivateCompany(String culitivateCompany) {
        this.culitivateCompany = culitivateCompany;
    }
    public String getCulitivateResult() {
        return culitivateResult;
    }
    public void setCulitivateResult(String culitivateResult) {
        this.culitivateResult = culitivateResult;
    }
}
