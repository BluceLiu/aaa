package edu.tsinghua.printer;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer dayinji=(Printer) bf.getBean("printer");
		
		dayinji.print();
	}

}
