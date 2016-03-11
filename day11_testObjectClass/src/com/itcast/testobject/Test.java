package com.itcast.testobject;

public class Test {
//Object类是所有java类的直接或者间接的父类
//Object  只是提供了一个类的基本框架
//它中的很多方法子类都要进行重写  后才有意义  如  hashCode()    toString()  equals()
//这三个方法在eclipse中可以自动生成      因为他是Object就有的   所以所有的类都有     而且几乎都会重写、
//所以eclipse 就集成了该功能
	public static void main(String[] args) throws InterruptedException{
			Object  obj = new Object();
			
			//获得该对象的包类名
			Class class1= obj.getClass();
			String name  = class1.getName();
			System.out.println(name);
			
			//获得hashCode
			int hashCode = obj.hashCode();  //它是通过对象的内存地址  计算出来的 而不是  内存地址
			System.out.println("哈希值:"+hashCode);
			System.out.println("转化为十六进制："+Integer.toHexString(hashCode));
			//toString方法
			//如果直接打印一个对象     打印语句会调用他的  toString()方法
			//如果一个类没有复写 toString方法 那么他的默认的值是他的父类的toString方法
			//Object类的toString方法打印出来的是        包类名 @十六进行的哈希值
			String  s  = obj.toString();
			System.out.println(s);
			
			
			Student st3  = new Student("张三",33);
			Student st4  = new Student("李四",44);
			Student st5  = new Student("张三",33);
			Student st6  = st3;
			
			System.out.println( st3.equals(st4));
			System.out.println( st3.equals(st5));
			System.out.println( st3.equals(st6));
			
			
			
			System.out.println(st3.toString());
		
			Thread.sleep(30000);
	}

}
