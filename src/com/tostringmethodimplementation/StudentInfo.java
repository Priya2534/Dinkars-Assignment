package com.tostringmethodimplementation;

public class StudentInfo {
	private int rollNo;
	private String name;

	StudentInfo(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return (name +"  " +rollNo);
		
	}
}
