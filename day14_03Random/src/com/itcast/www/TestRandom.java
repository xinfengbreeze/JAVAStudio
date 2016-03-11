package com.itcast.www;

import java.util.Random;

public class TestRandom {
	public  static  void main(String[] args){
	//Random  可以产生很多基本数据类型的   伪随机数    还可以传入种子   但是如果 传入的种子是一样的那么 两次的 产生的伪随机数也是一样的
		//Random  rd  = new  Random();  //默认的种子是   System.currentTimeMillis();
		Random  rd  = new  Random(50);
		System.out.println(rd.nextInt(5));;
		System.out.println(rd.nextFloat());  //0--1.0
		System.out.println(rd.nextBoolean());
		
		
		Random  rd1  = new  Random(50);
		System.out.println(rd1.nextInt(5));;
		System.out.println(rd1.nextFloat());  //0--1.0
		System.out.println(rd1.nextBoolean());
		
	}
}
