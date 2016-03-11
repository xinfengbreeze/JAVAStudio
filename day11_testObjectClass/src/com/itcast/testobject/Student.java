package com.itcast.testobject;
//student  ʵ�ֵ����Cloneable��û���κ�Ҫʵ�ֵķ���      ������ һ�����   ��ʾ ������ԵĶ�����Ա�Clone
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
	
	//��дhashCode()����
	//  ˼����   ȡһ���� ȥ����   ��Ա������ֵ ����hashCode
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//���� Ϊ�˽�׳��    ����ֱ���õ��� Object    ��ȻҲ����ʹ�� Student������������������Ĳ���Student�Ͳ���������������
	//������û���д��  Object����
	public boolean equals(Object obj) {
		//�����ͬһ������Ͳ��ñȽ���
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		//�ж����������ǲ���һ����
		if (getClass() != obj.getClass())
			return false;
		
		//�ж�����ֵ  �Ƿ�һ��
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
