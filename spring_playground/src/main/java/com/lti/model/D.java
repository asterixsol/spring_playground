package com.lti.model;

public class D 
{
	String x;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public D() {
		System.out.println("D()");
	}

	@Override
	public String toString() {
		return "D [x=" + x + "]";
	}
	
	

}
