package TestZenQiangFor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
//  List集合的遍历   有三种  方式   都要会    
//	1、普通 for    size()   和get(int Index)  
//  2、迭代器
//  3、 增强 for
//  但是 Collection  和    Set  是要将元素 先转换成    toArray()  然后遍历数组 ，而不是  用 get(index);
//  增强for的底层就是迭代器
	public static void main(String[] args) {
		ArrayList<String>   list   = new ArrayList<String>();		
		list.add("hello");
		list.add("java");		
		// 普通的for 循环  
		for(int i =0;i<list.size(); i++){
			String s = list.get(i);
			System.out.println(s);
		}		
		//迭代器
		Iterator<String>  it  = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}		
		//增强for
		for(String s : list){
			System.out.println(s);
		}
		
		int[]  ar = new int[]{1,2,3,4,5,6};
		for(int i : ar){
			System.out.print(i);
		}
	}
}

/* 下面 是 以上代码发编译出来的  源码       可以看出编译器编译的时候做了很多的是
 * 1、泛型经过编译  就没有了    说明  泛型是写给编译器看的   ， 然后他干了我们不用泛型时候干的工作
 * 2、我们用while型的循环 ，被优化成了for循环
 * 3、我们的增强for也被   变成了   用迭代器迭代器实现  ，说明    对集合用增强for那么他的底层实现是迭代器
 * for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s))
 * 4、 如果我们对数组  用增强for   那么他会 底层会使用 普通for  来实现
*/
/*
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("java");
		for (int i = 0; i < list.size(); i++)
		{
			String s = (String)list.get(i);
			System.out.println(s);
		}

		String s;
		for (Iterator it = list.iterator(); it.hasNext(); System.out.println(s))
			s = (String)it.next();

		String s;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s))
			s = (String)iterator.next();

		int ar[] = {
			1, 2, 3, 4, 5, 6
		};
		int ai[];
		int k = (ai = ar).length;
		for (int j = 0; j < k; j++)
		{
			int i = ai[j];
			System.out.print(i);
		}

	}

 */


