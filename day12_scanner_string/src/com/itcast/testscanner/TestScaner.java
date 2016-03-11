package com.itcast.testscanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestScaner {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner是基于正则表达式的文本扫描器
		//他的 构造方法   可以 传入 字符串  、 输入流InputStream、File对象
		Scanner	scanner  =new Scanner(System.in);
		

		//int a = scanner.nextInt();
		//int b = scanner.nextInt();
		//System.out.println("a="+a +", b="+b);
		//输入  7788 888
		//输出 a=7788, b=888      所以他默认是按照 空白符（空格 、tab、回车） 进行切割的
		
		
		//int a = scanner.nextInt();
		//String s =scanner.nextLine();
		//System.out.println(a +s);
		//这里程序只让我们输入一次  因为 当我们输入完数字的时候   要回车一下     但还是NextLine又是以 回车符（\r\n）作为结束标志的
		//所以他人为我们输入一行也结束了  所以  输入333回车    结果333回车
		
		
		// 读文件
		Scanner scan = new Scanner(new File("d:/testScanner.txt"));
		while(scan.hasNextLine()){
			String ss = scan.nextLine();
			System.out.println(ss);
		}
		
		
		String content = "测试一下   scanner获取字符串";
		Scanner scan2= new Scanner(content);
		String  s2  = scan2.next();
		System.out.println(s2);
		//但是 输出结果是           测试一下                 后面的内容没有了再次证明默认是以   空白符  作为切割标准的
		
	}

}
