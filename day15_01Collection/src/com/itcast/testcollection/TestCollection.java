package com.itcast.testcollection;

import java.util.ArrayList;
import java.util.Collection;

/* 
* 数组和集合的区别?
* 		A:长度区别
* 			数组的长度固定
* 			集合长度可变
* 		B:内容不同
* 			数组存储的是同一种类型的元素
* 			而集合可以存储不同类型的元素
* 		C:元素的数据类型问题	
* 			数组可以存储基本数据类型，也可以存储引用数据类型
* 			集合只能存储引用类型
* 
* 刚说过集合是存储多个元的，但是呢，存储多个元素我们也是有不同需求的：比如说，我要这多个元素中不能有相同的元素，
* 再比如说，我要这多个元素按照某种规则排序一下。针对不同的需求，Java就提供了不同的集合类，这样呢，Java就提供了很多个集合类。
* 这多个集合类的数据结构不同,结构不同不重要的，重要的是你要能够存储东西，并且还要能够使用这些东西，比如说判断，获取等。
* 既然这样，那么，这多个集合类是有共性的内容的，我们把这些集合类的共性内容不断的向上提取，最终就能形成集合的继承体系结构。
* 
* 数据结构：数据的存储方式。
* 
* Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的。(后面会慢慢的讲解)
* 
* Collection的功能概述：
* 1：添加功能
* 		boolean add(Object obj):添加一个元素
* 		boolean addAll(Collection c):添加一个集合的元素
* 2:删除功能
* 		void clear():移除所有元素
* 		boolean remove(Object o):移除一个元素
* 		boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
* 3:判断功能
* 		boolean contains(Object o)：判断集合中是否包含指定的元素
* 		boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
* 		boolean isEmpty()：判断集合是否为空
* 4:获取功能
* 		Iterator<E> iterator()(重点)
* 5:长度功能
* 		int size():元素的个数
* 		面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
* 6:交集功能
* 		boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
* 7：把集合转换为数组
* 		Object[] toArray()
*/
public class TestCollection {
		public static void  main(String[] args){
			test1();
		}
		public static void test1(){
			//Collection 是一个接口类 他的直接 子类 List  Set..也是  接口
			//Collection  创建 子类接口的实现类
			//记住这种思想
			//添加
			Collection   col1  =new ArrayList();  
			col1.add("hello");
			col1.add("java");
			col1.add("world");
			System.out.println(col1.toString());
			Collection  col2  =new ArrayList();
			col2.addAll(col1);
			System.out.println(col2.toString());
			
			//判断
			System.out.println(col2.isEmpty());
			System.out.println(col2.contains("java"));
			System.out.println(col2.containsAll(col1));
			//长度
			System.out.println(col1.size());
			
			//删除 
			col1.remove("java");
			System.out.println(col1.toString());
			col2.retainAll(col1);
			System.out.println(col2.toString());
			col1.removeAll(col2);
			System.out.println(col1.toString());
			col2.clear();
			System.out.println(col2.toString());
		}
}
