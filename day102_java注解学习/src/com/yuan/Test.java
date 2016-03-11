package com.yuan;

@MTest(value = "hello java",arr ={1,2,3},color = @MyAnnotation(color = "red"))
public class Test {
	public static void main(String[] args){
		
		if(Test.class.isAnnotationPresent(MTest.class)){
			MTest mtest = Test.class.getAnnotation(MTest.class);
			System.out.println(mtest.value());
			System.out.println(mtest.arr().length);
			System.out.println(mtest.color().color());
		}
	}
}
