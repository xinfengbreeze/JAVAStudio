package com.itcast.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	//Iterator 方法 只能向后迭代     但是List集合 还有特有的 ListIterator
	// 他多出了可以向前迭代    hasPrevious()   previous()    add()
	// 但是 他要向前迭代  必须先向后迭代     这样就没有什么实际的意义了   ，所以用的很少
	
	
	//在集合迭代的过程中   集合本身不可以改变  元素
	//解决方法 ： 1、用迭代器的 Iterator的remove()   和ListIterator的add()
	//       2、 用   普通的 for循环遍历    集合本身就可以改变元素的值了    , 增强for不可以  因为他的底层还是迭代器 
	//
	public static void main(String[] args) {
		List  list  = new ArrayList();
		list.add("hello");
		list.add("java");
		list.add("java1");
		list.add("world");
		
		ListIterator  it = list.listIterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.equals("java")){
				//list.add("andorid");//ConcurrentModificationException  并发修改异常
				it.add("android");    //他不是在集合的最后添加而是在   当前迭代的节点后面添加
			}
			if(s.equals("java1")){
				it.remove();       //删除当前迭代的节点
			}
		}	
		//上面的程序已经迭代到最后了  
		while(it.hasPrevious()){
			System.out.println((String)it.previous());
		}

	}

}
