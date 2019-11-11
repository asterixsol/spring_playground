package com.lti.runner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lti.model.C;
import com.lti.model.TestBean;

public class BFRunner {

	public static void main(String[] args)
	{
		System.out.println("Before Loading the Bean Factory");
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		System.out.println("After Loading the Bean Factory");
		
		System.out.println("Loading the Bean...");
		TestBean t=factory.getBean("tBean",TestBean.class);
		C c=factory.getBean("c",C.class);
		System.out.println("After Loading the Bean");
		System.out.println("Bean Loaded");
		
	}

}
