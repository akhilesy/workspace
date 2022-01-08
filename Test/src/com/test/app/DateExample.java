package com.test.app;

import java.util.Date;

public class DateExample {
	
	private String date1;
	private Date date2;
	
	
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	
	
	public DateExample(String date1, Date date2) {
		super();
		this.date1 = date1;
		this.date2 = date2;
	}
	
	
	@Override
	public String toString() {
		return "DateExample [date1=" + date1 + ", date2=" + date2 + "]";
	}
	
	

}
