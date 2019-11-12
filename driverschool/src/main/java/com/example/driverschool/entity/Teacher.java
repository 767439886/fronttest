package com.example.driverschool.entity;

/**
 * Teacher 实体类
 * @date 2019-11-12 13:44:57
 * @version 1.0
 */
public class Teacher implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double price;
	private String percent;
	private Long place;
	private int together ;

    public int getTogether() {
        return together;
    }
    public void setTogether(int together) {
        this.together = together;
    }
    /** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return this.price;
	}
	public void setPercent(String percent){
		this.percent = percent;
	}
	public String getPercent(){
		return this.percent;
	}
	public void setPlace(Long place){
		this.place = place;
	}
	public Long getPlace(){
		return this.place;
	}

}