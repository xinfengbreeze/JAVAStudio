package com.itcast.testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


//一定要记住 ：数组可以存放  基本数据类型 和引用数据类型      但是长度不可变
//        集合只能存放应用数据类型 （而不是对象）   ，但是长度可变
// 迭代器
// 1、 在迭代的过程中   集合本身    是不可以变化的（增删改查）  ，否则报出异常 CurrentModifiedExecption  并发修改异常
//	2、迭代过程中改变  集合元素所指向的对象的内容是  可以的  也是有效的
//在集合迭代的过程中   集合本身不可以改变  元素
//解决方法 ： 1、用迭代器的 Iterator的remove()   和ListIterator的add()
//       2、 用   普通的 for循环遍历    集合本身就可以改变元素的值了    , 增强for不可以  因为他的底层还是迭代器 
//

public class TestIterator {
	public static void main(String[] args) {
		Collection co  = new ArrayList();
		co.add(new Student("张三",33));
		co.add(new Student("李四",44));
		co.add(new Student("王五",55));	
		
		Iterator  it  = co.iterator();
		while(it.hasNext()){
			Student  stu = (Student)it.next(); // 将 集合中的元素（引用，而不是对象）传给stu
			System.out.println(stu.toString());
			stu.setAge(888);				//改变引用指向对象的内容是可以的   而且是有效的
			//这句并没有改变 集合的元素  因为集合存放的是对象的引用   而这里改变的是集合中元素所指向的对象的内容
			//所以是可以的也是有效的
			stu  =new Student("赵六",66);		//这句并不会改变 集合的元素
			// co.add(new Student("赵六",66));//在迭代的过程中 不可以改变集合   这句会报异常 CurrentModifiedExecption
			System.out.println(stu.toString());
		}
		
		List list = (List)co;
		System.out.println(((Student)list.get(1)).toString());
	}

}
class Student{
	String name ;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
