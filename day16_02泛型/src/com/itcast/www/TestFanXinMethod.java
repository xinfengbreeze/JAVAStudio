package com.itcast.www;

public class TestFanXinMethod {


	public static void main(String[] args) {
	TestTool<Integer>  t   = new TestTool<Integer>();
	System.out.println(t.show("hah"));     //在方法上不用指明  泛型
	System.out.println(t.show(false));
	System.out.println(t.show(8888)); 
	}

}
class  TestTool <T>{
	public  <E>  E show(E e){    // 泛型方法的   泛型定义在返回值前    他可以和类的泛型不一样     
		return e;
	}
}