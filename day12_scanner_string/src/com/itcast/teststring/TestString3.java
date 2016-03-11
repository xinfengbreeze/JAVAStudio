package com.itcast.teststring;

import java.util.Scanner;

public class TestString3 {
	public  static void main(String[] args){
		 //找出  字符串中的     某个  字段出现的次数
		Scanner  scan  = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s1 =  scan.nextLine();
		System.out.println("输入要查找的字段");
		String s2  = scan.nextLine();
		int count =0;
		int index =0;
		while( (index= s1.indexOf(s2,index) ) != -1){
			index +=s2.length();
			count++;
		}
		System.out.println("一共出现了"+count+"次");
	}
}
