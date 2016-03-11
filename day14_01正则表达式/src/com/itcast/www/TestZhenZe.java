package com.itcast.www;

import java.util.Scanner;

//正则表达式的判断功能
public class TestZhenZe {
	
	public static void  main(String[] args){
		//testPhoneNumber();
		testEmail();
		
	}
	//判断电话号码
	public static void testPhoneNumber(){
		String  s = "1[38]\\d{9}";
		Scanner ss = new Scanner(System.in);
		String  photo  = ss.nextLine();
		System.out.println(photo.matches(s));
	}
	//判断邮箱
	public  static  void testEmail(){
		Scanner scan  = new Scanner(System.in);
		System.out.println("请输入邮箱");
		String s  = scan.nextLine();
		//String regex  ="[a-z_0-9A-Z]+@[a-zA-Z_0-9]{2,6}(\\.[A-Za-z]+)+";
		String regex  ="\\w+@\\w{2,6}(\\.[A-Za-z]+)+";
		boolean flag = s.matches(regex);
		System.out.println(flag);
	}
}
