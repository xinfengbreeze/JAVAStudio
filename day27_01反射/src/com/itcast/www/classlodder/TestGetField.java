package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

//获取  Field的对象

public class TestGetField {
	public static  void main(String[] args) throws Exception{
		// 1、获得字节码文件对象
		Class  c  = Class.forName("com.itcast.www.classlodder.Person");
		//Person p  = new  Person();   p.address
		// 获取  成员变量
		Field fieldName   = c.getField("name");//获得公共的  变量名叫 address的成员方法
		Field fieldaddress  = c.getDeclaredField("address");
		Field[]  field1  = c.getFields();
		Field[]  field2  = c.getDeclaredFields();
		
		
		System.out.println(fieldName);
		System.out.println(fieldaddress);
		System.out.println(Arrays.toString(field1));
		System.out.println(Arrays.toString(field2));
		
		Constructor cons = c.getDeclaredConstructor(String.class,String.class);
		cons.setAccessible(true);
		Object obj =cons.newInstance("xiao  an","北京");
		
		Object obj1 = fieldName.get(obj);         //获得对象的   属性值
		Object obj2 = fieldaddress.get(obj);
		System.out.println(obj1 +" "+obj2);
		
		fieldName.set(obj,"小华");            //设置对象的  属性的值
		fieldaddress.set(obj, "南京");
		
		System.out.println(obj);
		
	}
}
