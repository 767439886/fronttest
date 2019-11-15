package com.example.yunyoupersonnel.entity;

import java.util.Date;

/**
 * Peoplemove 实体类
 * @date 2019-11-15 12:07:27
 * @version 1.0
 */
public class Peoplemove implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long uid;
	private java.util.Date translateDate;
	private String priorBranch;
	private String nextBranch;
	private String priorDuty;
	private String nextDuty;
	private String handeName;
	private String remark;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setUid(Long uid){
		this.uid = uid;
	}
	public Long getUid(){
		return this.uid;
	}
    public Date getTranslateDate() {
        return translateDate;
    }
    public void setTranslateDate(Date translateDate) {
        this.translateDate = translateDate;
    }
    public String getPriorBranch() {
        return priorBranch;
    }
    public void setPriorBranch(String priorBranch) {
        this.priorBranch = priorBranch;
    }
    public String getNextBranch() {
        return nextBranch;
    }
    public void setNextBranch(String nextBranch) {
        this.nextBranch = nextBranch;
    }
    public String getPriorDuty() {
        return priorDuty;
    }
    public void setPriorDuty(String priorDuty) {
        this.priorDuty = priorDuty;
    }
    public String getNextDuty() {
        return nextDuty;
    }
    public void setNextDuty(String nextDuty) {
        this.nextDuty = nextDuty;
    }
    public String getHandeName() {
        return handeName;
    }
    public void setHandeName(String handeName) {
        this.handeName = handeName;
    }
    public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}

}