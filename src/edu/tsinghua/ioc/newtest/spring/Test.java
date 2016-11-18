
package edu.tsinghua.ioc.newtest.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
		CunChu cunChu=(CunChu) bf.getBean("cunChu");		
		cunChu.save();
	}

}
