package com.example.yunyoupersonnel.entity;

/**
 * Basicsmessage 实体类
 * @date 2019-11-15 12:07:27
 * @version 1.0
 */
public class Basicsmessage implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long uid;
	private String phone;
	private String mobilePhone;
	private String address;
	private String incumbency;
	private String incumbencyType;
	private String resume;

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
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setIncumbency(String incumbency){
		this.incumbency = incumbency;
	}
	public String getIncumbency(){
		return this.incumbency;
	}
	public void setResume(String resume){
		this.resume = resume;
	}
	public String getResume(){
		return this.resume;
	}
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getIncumbencyType() {
        return incumbencyType;
    }
    public void setIncumbencyType(String incumbencyType) {
        this.incumbencyType = incumbencyType;
    }
}