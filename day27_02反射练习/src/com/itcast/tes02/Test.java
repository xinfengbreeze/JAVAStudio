package com.itcast.tes02;

public class Test {
	public static void main(String[] args) throws Exception{
		Student stu  = new Student();
		System.out.println(stu);
		ReflactTools.setValue(stu, "age", 22);
		System.out.println(stu);
		ReflactTools.setValue(stu, "name", "zhangSan");
		System.out.println(stu);
	}
	
	
}
class Student{
	private String name;
	public  int age;
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	
}