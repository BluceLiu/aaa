package edu.tsinghua.gazi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person gazi=(Person) ac.getBean("gazi");
		gazi.say();
		
		Person gazi1=(Person) ac.getBean("gazi");
		gazi1.say();
		
		System.out.println("gazi="+gazi);
		System.out.println("gazi1="+gazi1);
		Person rod=(Person) ac.getBean("rod");
		rod.say();
		System.out.println("-----------");
		
		Person gouzao=(Person) ac.getBean("gouzao");
		gouzao.say();
		Person gouzao1=(Person) ac.getBean("gouzao1");
		gouzao1.say();
	}

}
