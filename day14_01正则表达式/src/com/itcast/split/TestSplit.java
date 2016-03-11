package com.itcast.split;

import java.util.Arrays;

public class TestSplit {

	public static void main(String[] args) {
		String  s = "aa,bb,cc,dd";
		String[]  strArray = s.split(",");
		System.out.println(Arrays.toString(strArray));
		
		s = "aa.bb.cc.dd";
		strArray = s.split("\\.");
		System.out.println(Arrays.toString(strArray));
		
		s = "aa  bb  cc      dd";
		strArray = s.split(" +");
		System.out.println(Arrays.toString(strArray));
		
		//这里要特别的注意  就是   \   应为\是转义字符    所以他不会单独出现    要么\\表示 \   
		//  要么 \X   表示转义的 字符         如 \.  表示.   \r 表示回车
		//  所以 作为路径分隔符的时候 要用  \\       
		// 而我们切割的时候就是   切割字符串所以    有一个\  就要 \\
		s = "aa\\bb\\cc\\dd";
		strArray = s.split("\\\\");
		System.out.println(Arrays.toString(strArray));

	}

}
