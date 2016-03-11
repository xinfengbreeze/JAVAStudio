package com.yuan.test;
/**
 * 创建的对象的过程   new student()
 * new 关键子  为对象申请堆内存空间
 * student() 执行构造器
 * 1、执行super(....)父类的构造器    去创建父类的对象
 * 2、初始化本类中的成员变量          默认初始化、显示初始化
 * 3、看本类中是否有构造代码块  如果有 则执行构造代码块    
 * 4、执行 构造器中的其他  代码
 * 
 * 下面的实验证明了以上创建对象的过程       过程分析
 *运行结果
 *调用了Person的构造器创建Student的父类Person对象（先有父亲才能有儿子，这是JAVA的 “分层初始化”）
 *调用了X的构造器创建X对象
 *执行了Student构造代码块中的代码， 构造代码块中的代码相当于是该类所有构造器中提取出来的共同的代码
 *调用了Student的构造器的其他方法
 *
 *
 *其实很好理解   ：  这些设计都是符合现实世界的规律的     先有父亲再有儿子      先创建和初始化成员变量才可以  执行其他代码（应为有可能用到了这些变量）
 */
public class TestConstructor {
		public static void main(String[] args){
			Student stu = new Student();
		}
}

class  X {
	public X(){
		System.out.println("调用了X的构造器创建X对象");
	}
}
class  Person{
	public  Person(){
		System.out.println("调用了Person的构造器创建Student的父类Person对象（先有父亲才能有儿子，这是JAVA的 “分层初始化”）");
	}
}
class Student extends Person{
	X  x = new X(); //成员变量
	
	{//构造代码块
		System.out.println("执行了Student构造代码块中的代码， 构造代码块中的代码相当于是该类所有构造器中提取出来的共同的代码");
	}
	
	public Student(){//构造器
		
		System.out.println("调用了Student的构造器的其他方法");
	}
}
