package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactory01 {
	public static void main(String[] args) {
//		Attach the XML file using the classPathResource
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
//		Then create a BeanFactory object using the XMLBeanFactory
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		Grab a particular bean(object) from the myspring.xml using the "id" attribute
		PenClass01 p1 = (PenClass01) beanFactory.getBean("mypen01"); // returns a PenClass object
		p1.write();
		
	}

}
