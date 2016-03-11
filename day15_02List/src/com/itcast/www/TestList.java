package com.itcast.www;

import java.util.ArrayList;
import java.util.List;

// List集合是有序的        他可以保存重复的元素   
// List比 Collection 多了索引（因为有序）
// 索引List比Collection多了   一些 带索引操作的方法

//当然 如果  方法的索引超过了现有的索引就会报   指针越界异常
public class TestList {
	public static void main(String[] args){
		List  list  = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("张三");  //添加重复的元素
		
		//Collection可以通过toArray()方法    或者  Iterator来遍历
		//但是  List除了上面的方法 ， 还可以 用get(index)和size()组合遍历    还可以用特有的ListLterator来遍历
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}
		
		List  list2  = new ArrayList();
		list2.add("王二");
		list2.add("王二");
		
		//带索引的 添加 方法   相当一插入
		//list.add(5,"王七");   //IndexOutOfBoundsException  指针越界异常  应为当前的索引才0--3
		list.add(4,"赵六");
		list.addAll(0,list2);
		System.out.println();
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}		
		//删除      注意返回的是被删除的元素
		list.remove(5);
		//改        注意返回的是 被修改的旧元素
		list.set(0, "李一");
		
		System.out.println();
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}
		
		//查   indexOf(..) lastIndexOf(..)   get(..)
		System.out.println();
		System.out.println( list.indexOf("王五"));
		System.out.print((String)list.get(2));
	
	}

}
