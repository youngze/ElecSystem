package com.young.elec.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProviderCord {

	protected static ApplicationContext ac = null;
	
	//����beans.xml�ļ�(filename���õ���beans.xml)
	public static void load(String filename) {
		System.out.println("ServiceProviderCordִ����");
		ac = new ClassPathXmlApplicationContext(filename);
		
	}
	
}
