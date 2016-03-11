package com.itcast.testobject;
//student  实现的这个Cloneable类没有任何要实现的方法      他就是 一个标记   表示 这个可以的对象可以被Clone
public class Student  implements Cloneable {
	private String name;
	private int  age;
	public void setName(String name){
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	//复写hashCode()方法
	//  思想是   取一个数 去乘以   成员变量的值 或者hashCode
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//这里 为了健壮性    参数直接用的是 Object    当然也可以使用 Student但是那样如果传过来的不是Student就不会调用这个方法了
	//所以最好还是写成  Object参数
	public boolean equals(Object obj) {
		//如果是同一个对象就不用比较了
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		//判断两个对象是不是一个类
		if (getClass() != obj.getClass())
			return false;
		
		//判断属性值  是否一样
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
/*	public Student clone(){
		return  (Student)super.clone();
	}*/


	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
