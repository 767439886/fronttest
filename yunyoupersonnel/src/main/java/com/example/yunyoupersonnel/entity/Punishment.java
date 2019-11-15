package com.example.yunyoupersonnel.entity;

import java.util.Date;

/**
 * Punishment 实体类
 * @date 2019-11-15 12:07:27
 * @version 1.0
 */
public class Punishment implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long uid;
	private String position;
	private String rewardPunish;
	private String rewardContent;
	private String reason;
	private String branch;
	private String handleName;
	private java.util.Date startDate;
	private java.util.Date cancelDate;
	private String cancelReason;
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
	public void setPosition(String position){
		this.position = position;
	}
	public String getPosition(){
		return this.position;
	}

    public String getRewardPunish() {
        return rewardPunish;
    }
    public void setRewardPunish(String rewardPunish) {
        this.rewardPunish = rewardPunish;
    }
    public String getRewardContent() {
        return rewardContent;
    }
    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }
    public String getHandleName() {
        return handleName;
    }
    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getCancelDate() {
        return cancelDate;
    }
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    public void setReason(String reason){
		this.reason = reason;
	}
	public String getReason(){
		return this.reason;
	}
	public void setBranch(String branch){
		this.branch = branch;
	}
	public String getBranch(){
		return this.branch;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}

}