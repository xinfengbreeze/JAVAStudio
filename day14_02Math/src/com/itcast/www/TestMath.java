package com.itcast.www;

public class TestMath {
	public static void main(String[] args){
		//Math类的方法都是静态方法
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.ceil(12.3));   //向上取整
		System.out.println(Math.floor(12.58));  //向下取整
		System.out.println(Math.round(12.3));  //四舍五入
		System.out.println(Math.round(12.8));
		System.out.println(Math.round(-12.3));  //-13.0 + 0.7  = -13+1  = -12
		System.out.println(Math.abs(-8));		//绝对值
		System.out.println(Math.max(2, 3.3));   //最大值
		System.out.println(Math.min(2,3.3));
		
		System.out.println(Math.pow(2,3));		//幂运算
		System.out.println(Math.sqrt(4.4));		//平方根
		
		System.out.println((int)(Math.random()*100 +1));  // 随机数   [0--1)
	}

}
