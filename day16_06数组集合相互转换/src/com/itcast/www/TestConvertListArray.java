package com.itcast.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConvertListArray {
//集合和数组  之间是可以相会转换的
// 1、集合转 数组 用集合的  toArray()
// 2、数组转集合  用Arrays 的asList(T...e);  public static <T> List<T> asList(T... e);
// 要注意的是  数组转成的集合   是不可以增删操作的      可以修改
	public static void main(String[] args) {
		List<String>  list1  = new ArrayList<String>();
		list1.add("hello");
		list1.add("java");
		
		Object[] arr1 = list1.toArray();  // 集合转数组
		for(Object s : arr1){
			System.out.println((String)s);
		}
		
		String[]  arr2 = new String[]{"c","java","android"};
		List<String>  list2  = Arrays.asList(arr2);
		//list2.add("hello");    不可以进行  增删操作
		//list2.remove(1);    //java.lang.UnsupportedOperationException
		list2.set(0,"ccc");
		for(String s : list2){
			System.out.println(s);
		}

	}

}
