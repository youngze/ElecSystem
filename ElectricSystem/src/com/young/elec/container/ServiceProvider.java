package com.young.elec.container;

import org.apache.commons.lang.StringUtils;

@SuppressWarnings("static-access")
public class ServiceProvider {
	
	public static ServiceProviderCord spc = null;
	//����beans.xml�ļ�
	static {
		System.out.println("aaaaaaaaaa");
		spc = new ServiceProviderCord();
		spc.load("/beans.xml");
	}
	
	public static Object getService(String serviceName) {
		System.out.println("bbbbbbbbbbb");
		Object object = null;
		if(StringUtils.isBlank(serviceName)) {
			System.out.println("StringUtils.isNotBlank(serviceName)ִ����");
			throw new RuntimeException("��ǰ�������Ʋ�����");
		} 
		if(spc.ac.containsBean(serviceName)) {
			object = spc.ac.getBean(serviceName);
			System.out.println("getBeanִ����");
		}
		if(object == null) {
			throw new RuntimeException("��ǰ�������ơ�" + serviceName + "���µĽڵ㲻����" );
		}
		return object;
	}
	
}
