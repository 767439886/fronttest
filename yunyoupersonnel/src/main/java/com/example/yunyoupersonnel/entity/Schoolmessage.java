package com.example.yunyoupersonnel.entity;

import java.util.Date;

/**
 * Schoolmessage 实体类
 * @date 2019-11-15 12:07:27
 * @version 1.0
 */
public class Schoolmessage implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String computerLevel;
	private java.util.Date graduateDate;
	private Long accumulateID;
	private String administrationLevel;
	private String duty;
	private String position;
	private String foreignLanuage;
	private String FLlevel;
	private Long uid;
	private String university ;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
    public String getComputerLevel() {
        return computerLevel;
    }
    public void setComputerLevel(String computerLevel) {
        this.computerLevel = computerLevel;
    }
    public Date getGraduateDate() {
        return graduateDate;
    }
    public void setGraduateDate(Date graduateDate) {
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
    public String getForeignLanuage() {
        return foreignLanuage;
    }
    public void setForeignLanuage(String foreignLanuage) {
        this.foreignLanuage = foreignLanuage;
    }
    public void setDuty(String duty){
		this.duty = duty;
	}
	public String getDuty(){
		return this.duty;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public String getPosition(){
		return this.position;
	}
    public String getFLlevel() {
        return FLlevel;
    }
    public void setFLlevel(String FLlevel) {
        this.FLlevel = FLlevel;
    }
    public void setUid(Long uid){
		this.uid = uid;
	}
	public Long getUid(){
		return this.uid;
	}
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
}