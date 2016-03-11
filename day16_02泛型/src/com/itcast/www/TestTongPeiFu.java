package com.itcast.www;

import java.util.ArrayList;
import java.util.Collection;

//泛型要掌握的几个  知识点  
// 1、为什么要产生泛型
// 2、泛型的好处
//3、泛型函数    泛型方法   泛型接口        泛型通配符
//?
// ？extends E
// ？ super  E
public class TestTongPeiFu {

	public static void main(String[] args) {
		//Collection<Animal>  c1= new ArrayList<Dog>();  //泛型的规则   前后要一致否则 报错
		Collection<Animal>  c1= new ArrayList<>();  //后面不写可以 1.7jdk 实现了自动匹配和前面的一致
		//Collection<>  c1= new ArrayList<Dog>();  //这里前面不写不可以
		Collection<?>  c2= new ArrayList<Dog>();  //  用了通配符以后就可以不写   他和后面的一样
		Collection<Animal>  c= new ArrayList<Animal>();
		
		Collection<? extends Animal>  c3= new ArrayList<Animal>();  //向上限定    E就是上限   包含E和E的子类     
		Collection<? extends Animal>  c0= new ArrayList<Dog>();  //向上限定   E就是上限   包含E和E的子类
		Collection<? extends Animal>  c4= new ArrayList<Cat>();
		//Collection<? extends Animal>  c5= new ArrayList<Object>();  这里就不可以了
		
		Collection<? super Animal>  c6= new ArrayList<Object>();   //向下限定  E就是下限 E和E的父类
		Collection<? super Animal>  c9= new ArrayList<Animal>();   //向下限定   E就是下限 E和E的父类
		//Collection<? super Animal>  c7= new ArrayList<Cat>();
		//Collection<? super Animal>  c8= new ArrayList<Dog>();
	}

}
class  Animal {
	
}

class Dog  extends Animal{
	
}
class Cat extends Animal{
	
}