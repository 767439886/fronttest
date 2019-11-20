package com.example.yunyoupersonnel.entity;

import java.util.Date;

/**
 * User 实体类
 * @date 2019-11-15 12:07:27
 * @version 1.0
 */
public class User implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String password;
	private String sex;
	private String branch;
	private String idCard;
	private String nativePlace;
	private String marriage;
	private String politics;
	private String folk;
	private String education;
	private String deparment;
	private String name ;
    private String phone;
    private String mobilePhone;
    private String address;
    private String incumbency;
    private String incumbencyType;
    private String resume;
    private String computerLevel;
    private String graduateDate;
    private Long accumulateID;
    private String administrationLevel;
    private String duty;
    private String position;
    private String foreignLanuage;
    private String FLlevel;
    private String university ;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setBranch(String branch){
		this.branch = branch;
	}
	public String getBranch(){
		return this.branch;
	}
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    public void setMarriage(String marriage){
		this.marriage = marriage;
	}
	public String getMarriage(){
		return this.marriage;
	}
	public void setPolitics(String politics){
		this.politics = politics;
	}
	public String getPolitics(){
		return this.politics;
	}
	public void setFolk(String folk){
		this.folk = folk;
	}
	public String getFolk(){
		return this.folk;
	}
	public void setEducation(String education){
		this.education = education;
	}
	public String getEducation(){
		return this.education;
	}
	public void setDeparment(String deparment){
		this.deparment = deparment;
	}
	public String getDeparment(){
		return this.deparment;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIncumbency() {
        return incumbency;
    }

    public void setIncumbency(String incumbency) {
        this.incumbency = incumbency;
    }

    public String getIncumbencyType() {
        return incumbencyType;
    }

    public void setIncumbencyType(String incumbencyType) {
        this.incumbencyType = incumbencyType;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getComputerLevel() {
        return computerLevel;
    }

    public void setComputerLevel(String computerLevel) {
        this.computerLevel = computerLevel;
    }

    public String getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(String graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Long getAccumulateID() {
        return accumulateID;
    }

    public void setAccumulateID(Long accumulateID) {
        this.accumulateID = accumulateID;
    }

    public String getAdministrationLevel() {
        return administrationLevel;
    }

    public void setAdministrationLevel(String administrationLevel) {
        this.administrationLevel = administrationLevel;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getForeignLanuage() {
        return foreignLanuage;
    }

    public void setForeignLanuage(String foreignLanuage) {
        this.foreignLanuage = foreignLanuage;
    }

    public String getFLlevel() {
        return FLlevel;
    }

    public void setFLlevel(String FLlevel) {
        this.FLlevel = FLlevel;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}