package com.itcast.com;

import java.util.ArrayList;
//  生活中有很多   集合  的列子
// 而且 集合中  嵌套  集合                         比如  学校是个集合    班级是个集合       集合中嵌套集合
public class testInerList {

	public static void main(String[] args) {
		
		//创建学校
		ArrayList<ArrayList<Student>>  school  = new ArrayList<ArrayList<Student>>();
		
		//创建班级
		ArrayList<Student>  classRoom1   = new ArrayList<Student>();
		//班级中添加  学生
		classRoom1.add(new Student("1_张三"));
		classRoom1.add(new Student("1_李四"));
		classRoom1.add(new Student("1_王五"));
		classRoom1.add(new Student("1_赵六"));
		
		ArrayList<Student>  classRoom2   = new ArrayList<Student>();
		classRoom2.add(new Student("2_张三"));
		classRoom2.add(new Student("2_李四"));

		
		ArrayList<Student>  classRoom3   = new ArrayList<Student>();
		classRoom3.add(new Student("3_张三"));
		
		//向学校中添加 班级
		school.add(classRoom1);
		school.add(classRoom2);
		school.add(classRoom3);
		
		//遍历
		for(ArrayList<Student>  classRoom: school){
			   for(Student  stu :classRoom){
				   System.out.println(stu.getName());
			   }
		}
			
	}

}
class Student{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student(String name) {
		super();
		this.name = name;
	}
}