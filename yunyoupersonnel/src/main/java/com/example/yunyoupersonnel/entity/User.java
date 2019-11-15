package com.example.yunyoupersonnel.entity;

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

}