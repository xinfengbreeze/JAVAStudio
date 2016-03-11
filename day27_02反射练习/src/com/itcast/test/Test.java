package com.itcast.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

//  读取配置文件中的  配置信息   来决定运行  哪一个类的job方法
//  只要改变配置文件就可以实现    调用不同类的不同方法
public class Test {
	public static void main(String[] args) throws Exception{
	 //获得配置文件
		FileReader  fr = new FileReader("class.properties");
		Properties  ps = new Properties();
		ps.load(fr);  //加载配置文件
	String className = 	ps.getProperty("className");  //获得配置信息
	String methodName = ps.getProperty("methodName");
	System.out.println(className +"::::"+ methodName);
	 fr.close();//关闭输入流
	
	 //获得字节码文件对象  
	Class c = Class.forName(className);  
	//获得构造器对象
	Constructor cons  = c.getDeclaredConstructor();
	cons.setAccessible(true);  //设置可访问    确保 可以访问   以免在类中方法是 被保护的
	
	//获得方法对象
	Method meth  = c.getDeclaredMethod(methodName);
	meth.setAccessible(true);
	
	//创建对象
	Object obj = cons.newInstance();
	//调用对象的方法
	meth.invoke(obj);
		
	}
}
