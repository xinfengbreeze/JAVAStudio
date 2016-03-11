package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

//类的结构
//  Class 字节码文件对象
//  Field  成员变量 对象
//  Constructor  构造方法对象
//  Method  方法对象
/*
*  Constructor getConstructor()         //只能获得public修饰的无参构造器
*  Constructor getConstructor(Class<?>...classobj)
*  Constructor[] getConstructors()		// 获得全部 public修饰的构造器
*  Constructor getDeclaredConstructor() //获得  无参构造器    无视 修饰符
*  Constructor getDeclaredConstructor(Class<?>...classobj)
*  Constructor[] getDeclaredConstructors()  获得  获得所有构造器    无视修饰符
*  
*  通过  Construct的类对象  的newInstance(....)方法创建对象
*/
public class TestGetConstructor {
  public  static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	  //1、获得字节码文件对象     Class
	  Class cc = null;
		 cc  = Class.forName("com.itcast.www.classlodder.Person");
	//获得  public 无参构造
	  Constructor cons1 = cc.getConstructor();
	  System.out.println(cons1);
	  
	//获得  public  有参数构造器
	  Constructor cons2 = cc.getConstructor(String.class ,int.class,String.class);
	  System.out.println(cons2);
	  
	//获得  public修饰的全部  构造器
	  Constructor[] cons3 = cc.getConstructors();
	  System.out.println( Arrays.toString(cons3) ); 
	  
	// 获得  有参数构造器    无视修饰符    即使你是  private修饰  也能获取到	  
	//如果指定  方法没有找到也会爆异常   java.lang.NoSuchMethodException
	  Constructor cons4 = cc.getDeclaredConstructor(String.class,String.class ,int.class );
	  System.out.println(cons4);
	  
	 //获得 全部构造器   无视修饰符
	  Constructor[] cons5 = cc.getDeclaredConstructors();
	  System.out.println( Arrays.toString(cons5) );  
	  
	  
	  //用获得的构造器  创建实例对象
	  //对于用  非public修饰的构造器  即使  你获得了  构造方法 也不能直接创建对象      还必须先将构造器设置为可访问   .setAccessible(true)
	  //否则会异常  ava.lang.IllegalAccessException
	  cons4.setAccessible(true);
	  Person pp = (Person)cons4.newInstance("小天","重庆",25);
	  System.out.println(pp);
  }
}
