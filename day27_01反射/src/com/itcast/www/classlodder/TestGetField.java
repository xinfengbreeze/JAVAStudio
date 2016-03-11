package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

//��ȡ  Field�Ķ���

public class TestGetField {
	public static  void main(String[] args) throws Exception{
		// 1������ֽ����ļ�����
		Class  c  = Class.forName("com.itcast.www.classlodder.Person");
		//Person p  = new  Person();   p.address
		// ��ȡ  ��Ա����
		Field fieldName   = c.getField("name");//��ù�����  �������� address�ĳ�Ա����
		Field fieldaddress  = c.getDeclaredField("address");
		Field[]  field1  = c.getFields();
		Field[]  field2  = c.getDeclaredFields();
		
		
		System.out.println(fieldName);
		System.out.println(fieldaddress);
		System.out.println(Arrays.toString(field1));
		System.out.println(Arrays.toString(field2));
		
		Constructor cons = c.getDeclaredConstructor(String.class,String.class);
		cons.setAccessible(true);
		Object obj =cons.newInstance("xiao  an","����");
		
		Object obj1 = fieldName.get(obj);         //��ö����   ����ֵ
		Object obj2 = fieldaddress.get(obj);
		System.out.println(obj1 +" "+obj2);
		
		fieldName.set(obj,"С��");            //���ö����  ���Ե�ֵ
		fieldaddress.set(obj, "�Ͼ�");
		
		System.out.println(obj);
		
	}
}
