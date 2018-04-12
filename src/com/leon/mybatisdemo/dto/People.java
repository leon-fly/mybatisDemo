package com.leon.mybatisdemo.dto;

public class People {
	private int id;
	private String name;
	private String sex;
	
	public People() {
	}
	public People(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null==this?null:this.getName()+"-"+this.getSex();
	}
	
}
