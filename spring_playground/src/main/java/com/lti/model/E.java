package com.lti.model;

public class E {
	
	D d;

	public E() {
		System.out.println("E()");
	}

	public D getD() {
		return d;
	}

	public void setD(D d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "E [d=" + d + "]";
	}
	
	

}
