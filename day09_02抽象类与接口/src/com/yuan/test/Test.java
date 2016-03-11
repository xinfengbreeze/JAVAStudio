package com.yuan.test;
/*
抽象类(掌握)
	(1)把多个共性的东西提取到一个类中，这是继承的做法。
	   但是呢，这多个共性的东西，在有些时候，方法声明一样，但是方法体。
	   也就是说，方法声明一样，但是每个具体的对象在具体实现的时候内容不一样。
	   所以，我们在定义这些共性的方法的时候，就不能给出具体的方法体。
	   而一个没有具体的方法体的方法是抽象的方法。
	   在一个类中如果有抽象方法，该类必须定义为抽象类。
	(2)抽象类的特点
		A:抽象类和抽象方法必须用关键字abstract修饰
		B:抽象类中不一定有抽象方法,但是有抽象方法的类一定是抽象类
		C:抽象类不能实例化
		D:抽象类的子类
			a:是一个抽象类。
			b:是一个具体类。这个类必须重写抽象类中的所有抽象方法。
	(3)抽象类的成员特点：
		A:成员变量
			有变量，有常量
		B:构造方法
			有构造方法
		C:成员方法
			有抽象，有非抽象
	(4)抽象类的练习
		A:猫狗案例练习
		B:老师案例练习
		C:学生案例练习
		D:员工案例练习
	(5)抽象类的几个小问题
		A:抽象类有构造方法，不能实例化，那么构造方法有什么用?
			用于子类访问父类数据的初始化
		B:一个类如果没有抽象方法,却定义为了抽象类，有什么用?
			为了不让创建对象
		C:abstract不能和哪些关键字共存
			a:final	冲突
			b:private 冲突
			c:static 无意义
接口(掌握)
	(1)回顾猫狗案例，它们仅仅提供一些基本功能。
	   比如：猫钻火圈，狗跳高等功能，不是动物本身就具备的，
	   是在后面的培养中训练出来的，这种额外的功能，java提供了接口表示。
	(2)接口的特点：
		A:接口用关键字interface修饰
			interface 接口名 {}
		B:类实现接口用implements修饰
			class 类名 implements 接口名 {}
		C:接口不能实例化
		D:接口的实现类
			a:是一个抽象类。
			b:是一个具体类，这个类必须重写接口中的所有抽象方法。
	(3)接口的成员特点：
		A:成员变量
			只能是常量
			默认修饰符：public static final
		B:构造方法
			没有构造方法
		C:成员方法
			只能是抽象的
			默认修饰符：public abstract
	(4)类与类,类与接口,接口与接口
		A:类与类
			继承关系，只能单继承，可以多层继承
		B:类与接口
			实现关系，可以单实现，也可以多实现。
			还可以在继承一个类的同时，实现多个接口
		C:接口与接口
			继承关系，可以单继承，也可以多继承
 */
/**
 抽象类和接口的区别：
A:成员区别
	抽象类：
		成员变量：可以变量，也可以常量
		构造方法：有
		成员方法：可以抽象，也可以非抽象
	接口：
		成员变量：只可以常量
		成员方法：只可以抽象	
B:关系区别
	类与类
		继承，单继承
	类与接口
		实现，单实现，多实现
	接口与接口
		继承，单继承，多继承	
C:设计理念区别
	抽象类 被继承体现的是：”is a”的关系。抽象类中定义的是该继承体系的       共性功能。
	接口 被实现体现的是：”like a”的关系。接口中定义的是该继承体系的        扩展功能。
	
	设计理念很重要
 */
public class Test {
	public static void  main(String[] args){
		SmartDog  d  = new SmartDog();
		d.sleep();
		d.eat();
		d.show();
	}

}

 //  每个动物都会睡觉  吃饭         但是有有些动物会  做游戏
abstract class  Animal {
	public void sleep(){    // 动物睡觉都是一样的
		System.out.println("动物睡觉z Z Z");
	}
	
	public abstract void eat();  //每个动物吃的东西不一样
}

class  Dog  extends Animal{
	public void eat(){
		System.out.println("狗吃骨头");
	}
}

class Cat  extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
//除此之外   有些 狗还会  表演
interface Show{
	public abstract void  show();
}

class SmartDog extends Dog  implements Show{   //这里它除了有狗的共性功能以外还有  表演的扩展功能
	public void show(){
		System.out.println("会表演功能的,表演算算术");
	}
}
