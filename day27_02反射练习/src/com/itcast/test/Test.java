package com.itcast.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

//  ��ȡ�����ļ��е�  ������Ϣ   ����������  ��һ�����job����
//  ֻҪ�ı������ļ��Ϳ���ʵ��    ���ò�ͬ��Ĳ�ͬ����
public class Test {
	public static void main(String[] args) throws Exception{
	 //��������ļ�
		FileReader  fr = new FileReader("class.properties");
		Properties  ps = new Properties();
		ps.load(fr);  //���������ļ�
	String className = 	ps.getProperty("className");  //���������Ϣ
	String methodName = ps.getProperty("methodName");
	System.out.println(className +"::::"+ methodName);
	 fr.close();//�ر�������
	
	 //����ֽ����ļ�����  
	Class c = Class.forName(className);  
	//��ù���������
	Constructor cons  = c.getDeclaredConstructor();
	cons.setAccessible(true);  //���ÿɷ���    ȷ�� ���Է���   ���������з����� ��������
	
	//��÷�������
	Method meth  = c.getDeclaredMethod(methodName);
	meth.setAccessible(true);
	
	//��������
	Object obj = cons.newInstance();
	//���ö���ķ���
	meth.invoke(obj);
		
	}
}
