package com.example.driverschool.entity;

/**
 * Exercisetime 实体类
 * @date 2019-11-12 10:38:41
 * @version 1.0
 */
public class Exercisetime implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String exercisetime;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setExercisetime(String exercisetime){
		this.exercisetime = exercisetime;
	}
	public String getExercisetime(){
		return this.exercisetime;
	}

}