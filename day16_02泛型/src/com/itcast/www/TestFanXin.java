package com.itcast.www;
import java.util.ArrayList;
import java.util.Iterator;
// 为什么要产生泛型
// 集合的两个缺点
//  1、集合存入是Object类型   对存入集合的元素没有限制                比如我向集合中放入Dog类  再放入Cat类这是不合理的
// 2、集合取出元素也是Object    他不知道我存入的是什么类型的元素      需要强转    如果转错了就会抛出ClassCastException
//  但是 数组就不同     在创建的时候  就指定存入元素的类型    String[] str;    int[]   arr;
//  所以设计了    泛型    
//  它集合在创建的时候就   指定存入元素的  类型                我们存入的元素类型得到了限制，集合中取出的元素的类型也明确了，不用强制转换
//  然而   如果有泛型但是我们没有  给泛型传入值    那么它默认是Object类型，就像我们前面写的例子 
public class TestFanXin {
	public static void main(String[] args) {
		ArrayList<String>   list  = new ArrayList<String>();
		list.add("hello");   //有了泛型    add(String s)  不再是  add(Object obj);
		list.add("java");
		list.add("world");
		Iterator<String>  it  =  list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());  // 有了泛型以后他返回的就是你泛型指定的类型     不是Object了
		}
	}
}
  
