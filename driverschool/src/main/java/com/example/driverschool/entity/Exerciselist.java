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
	private Long teacherid;
	private Long execisetime;
	private Double price;

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
	public void setTeacherid(Long teacherid){
		this.teacherid = teacherid;
	}
	public Long getTeacherid(){
		return this.teacherid;
	}
	public void setExecisetime(Long execisetime){
		this.execisetime = execisetime;
	}
	public Long getExecisetime(){
		return this.execisetime;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return this.price;
	}

}