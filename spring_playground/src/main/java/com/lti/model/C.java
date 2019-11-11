package com.lti.model;

public class C {

	int x;
	String name;
	
	public C()
	{
		System.out.println("C()");
	}
	public String getName() {
		return name;
	}
	
	public int getX() 
	{
		return x;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	@Override
	public String toString() {
		return "C [x=" + x + ", name=" + name + "]";
	}
	
	public C(int x,String name)
	{
		System.out.println("C(x,name)");
		this.x=x;
		this.name=name;
	}
	
	public C(String name,int x)
	{
		System.out.println("C-hey");
		this.x=x;
		this.name=name;
	} 
	
	

}
