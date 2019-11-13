package com.example.driverschool.entity;

/**
 * Exerciselist 实体类
 * @date 2019-11-12 10:38:41
 * @version 1.0
 */
public class Exerciselist implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long uid;
	private Long teacherId;
	private String execiseTime;
	private Double price;
	private String date ;
	private String area ;
	private String name ;

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
    public Long getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    public String getExeciseTime() {
        return execiseTime;
    }
    public void setExeciseTime(String execiseTime) {
        this.execiseTime = execiseTime;
    }
    public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return this.price;
	}
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}