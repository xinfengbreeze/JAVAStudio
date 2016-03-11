package com.itcast.www.classlodder;
/*
����ص�jvm�е�ȫ����
1����ļ���      ��class�ļ����ص��ڴ��У�������Class����                   ������Դ��ͬ��class�ļ� �ò�ͬ�ļ�����  Ҳ�����Զ����������ͨ���̳�ClassLoader
2���������    �������ض��������ݺϲ���JRE��
3����ĳ�ʼ��    ��ʼ�� ���е���ر���

������������    
Bootstrap ClassLoader ���������    ���ڼ��� Java�ĺ�����  ����string system....  ��java/jdk1.8.0_05/jre/lib/rt.jar����
Extension ClassLoader ��չ�������    ���ڼ���   .../jre/lib/ext�е���
System ClassLoader  ϵͳ�������     ���ڼ����û���д����
�Զ����������   �̳� ClassLoader  

JAVA���������������״̬�У���������һ���࣬���ܹ�֪���������������Ժͷ�����
��������һ�����󣬶��ܹ�������������һ�����������ԣ�
���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�Ϊjava���Եķ�����ơ�

�������ֽ����ļ�����  ��÷�����
1. Class.forName(String  ������ ȫ·�� );
2�� ����.class   �������е�class����
3������.getClass()  

ʵ�ʿ����ж���  Class.forName(...)  ӦΪ�����Ĳ�����һ���ַ���   ���Զ�̬��  ����  �� �Ҹ��κ�һ����İ���ȫ·�� ���Ϳ��Ի�ø����Class����
��������Ժܸ�


����  Class�����   newInstance()����  ���� ͨ���޲ι�����  ����һ������

*/



public class TestGetClass {
   public static void main(String[] args){
	   Class   ccc = null ;
	   //1��  Class.forName( String ����ȫ·��   )
	   try {
		ccc = Class.forName("com.itcast.www.classlodder.Person");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	   System.out.println(ccc.toString());
	   
	   Person  p = new Person();
	  // 2�� ����.getClass();
	   ccc = p.getClass();
	   System.out.println(ccc.toString());
	   
	   // 3������.class
	   ccc= Person.class;
	   System.out.println(ccc.toString());
	   
	   
	   //����һ������  
	   Person pp  = null;
	   try {
		   pp  = (Person)ccc.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
		e.printStackTrace();
	}
	   System.out.println(pp);
	   
   }
}
