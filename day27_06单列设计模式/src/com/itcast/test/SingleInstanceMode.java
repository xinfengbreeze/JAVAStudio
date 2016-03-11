package com.itcast.test;

import java.io.IOException;

/*
 * 单列设计模式思想   ：保证该类在内存中只有一个对象
 * 			那么如何保证在内存在唯一性？
 * 				1、所有的   构造方法私有
 * 				2、自己创建一个  私有的  静态  对象
 * 				3、提供一个  公开的   静态的   获取方法
 *            饿汉式：类加载的时候就  创建对象  （实际开发中用饿汉式）
 *            懒汉式：用的时候，没有才创建对象（面试的时候会考  懒汉式的特点）
 *            			A：懒加载   :(延时加载)
 *            			B：线程不安全   （多个线程调用获取单例的方法时，有可能造成线程不安全）
 *            				为了解决这个问题可以在 获取单列的方法上加上同步 synchronized
 * 
 * */
public class SingleInstanceMode {
	public static void  main (String[] args){
			Student stu2  = Student.getInstance();
			Student stu1  = Student.getInstance();
			System.out.println(stu1==stu2);
			
			Teacher t1 = Teacher.getInstance();
			Teacher t2 = Teacher.getInstance();
			System.out.println(t1==t2);
			
			
			
			//Runtime 类就是采用的是  饿汉式 单列设计模式
			Runtime   rt  = Runtime.getRuntime();
			try {
				rt.exec("notepad");     // 运行DOS命令
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
/*
Runtime  就是采用的是 饿汉式单列设计模式     

public class Runtime {
private static Runtime currentRuntime = new Runtime();

public static Runtime getRuntime() {
    return currentRuntime;
}*/


//饿汉式
class Student{
	//所有的构造方法私有
	private Student(){
		
	};
	//自己创建一个私有的静态对象
	//要加上static    为了下面的静态方法可以调用
	// 加上private  	是为了外界不可以直接调用
	private static Student stu = new Student();
	//提供一个公开的静态的获取方法
	//不可以new对象那么只有   通过类的静态方法
	public  static Student getInstance(){
		return stu;
	}	
}


//懒汉式
class  Teacher{
	private Teacher(){
		
	}
	private static Teacher  teacher = null;
	
	 public static synchronized Teacher  getInstance(){   // 所以要加上synchronized
		if(teacher ==null){
			//这里如果果个线程进入的话就线性不安全
			teacher  = new Teacher();
		}
		return teacher;
	}
}

