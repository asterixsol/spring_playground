package com.lti.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.TestBean;

public class ACRunner 
{
	public static void main(String[] args)
	{
		
	
	System.out.println("Loading the Application Context....");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println("After Loading the Application Context");
	
	System.out.println("Loading the Bean....");
	TestBean t=ctx.getBean("tBean",TestBean.class);
	System.out.println("After Loading the Bean");
	System.out.println("Bean Loaded");
	}
}
