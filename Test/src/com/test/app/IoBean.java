package com.test.app;

public class IoBean {
	
	private int id;
	private String name;
	
	
	@Override
	public String toString() {
		return "IoBean [id=" + id + ", name=" + name + "]";
	}
	
	
	public IoBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public IoBean() {
		// TODO Auto-generated constructor stub
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
	
	

}
