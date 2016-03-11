package com.itcast.www.classlodder;
/*
类加载到jvm中的全过程
1、类的加载      将class文件加载到内存中，并产生Class对象                   对于来源不同的class文件 用不同的加载器  也可以自定义类加载器通过继承ClassLoader
2、类的连接    将类的相关二进制数据合并到JRE中
3、类的初始化    初始化 类中的相关变量

加载器的类型    
Bootstrap ClassLoader 根类加载器    用于加载 Java的核心类  例如string system....  在java/jdk1.8.0_05/jre/lib/rt.jar的类
Extension ClassLoader 扩展类加载器    用于加载   .../jre/lib/ext中的类
System ClassLoader  系统类加载器     用于加载用户编写的类
自定义类加载器   继承 ClassLoader  

JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
对于任意一个对象，都能够调用它的任意一个方法和属性；
这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

获得类的字节码文件对象  获得方法：
1. Class.forName(String  包类名 全路径 );
2、 类名.class   利用类中的class属性
3、对象.getClass()  

实际开发中多用  Class.forName(...)  应为的他的参数是一个字符串   可以动态的  设置  ， 我给任何一个类的包类全路径 他就可以获得该类的Class对象
这样灵活性很高


调用  Class对象的   newInstance()方法  可以 通过无参构造器  构造一个对象

*/



public class TestGetClass {
   public static void main(String[] args){
	   Class   ccc = null ;
	   //1、  Class.forName( String 包类全路径   )
	   try {
		ccc = Class.forName("com.itcast.www.classlodder.Person");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	   System.out.println(ccc.toString());
	   
	   Person  p = new Person();
	  // 2、 对象.getClass();
	   ccc = p.getClass();
	   System.out.println(ccc.toString());
	   
	   // 3、类名.class
	   ccc= Person.class;
	   System.out.println(ccc.toString());
	   
	   
	   //创建一个对象  
	   Person pp  = null;
	   try {
		   pp  = (Person)ccc.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
		e.printStackTrace();
	}
	   System.out.println(pp);
	   
   }
}
