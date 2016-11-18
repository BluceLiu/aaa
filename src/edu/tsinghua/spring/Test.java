package edu.tsinghua.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		HelloSpring hs2=new HelloSpring();
		System.out.println(hs2);
		hs2.setMessage("IOC");
		hs2.say();
		System.out.println("-----------");
		//加载配置文件
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得对象 实体
		HelloSpring hs=(HelloSpring) factory.getBean("hs");
		hs.say();
		hs.setMessage("update");
		
		HelloSpring hs1=(HelloSpring) factory.getBean("hs");
		hs1.say();
		System.out.println(hs+"\t"+hs1);
	}

}
