package com.spring.example;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		System.out.println("Leonelle Messi");
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"//Users/mithunazhagappan/x/workspace/SpringTutorial/src/main/resources/spring.xml");

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
