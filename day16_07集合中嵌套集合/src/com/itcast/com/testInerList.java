package com.itcast.com;

import java.util.ArrayList;
//  �������кܶ�   ����  ������
// ���� ������  Ƕ��  ����                         ����  ѧУ�Ǹ�����    �༶�Ǹ�����       ������Ƕ�׼���
public class testInerList {

	public static void main(String[] args) {
		
		//����ѧУ
		ArrayList<ArrayList<Student>>  school  = new ArrayList<ArrayList<Student>>();
		
		//�����༶
		ArrayList<Student>  classRoom1   = new ArrayList<Student>();
		//�༶�����  ѧ��
		classRoom1.add(new Student("1_����"));
		classRoom1.add(new Student("1_����"));
		classRoom1.add(new Student("1_����"));
		classRoom1.add(new Student("1_����"));
		
		ArrayList<Student>  classRoom2   = new ArrayList<Student>();
		classRoom2.add(new Student("2_����"));
		classRoom2.add(new Student("2_����"));

		
		ArrayList<Student>  classRoom3   = new ArrayList<Student>();
		classRoom3.add(new Student("3_����"));
		
		//��ѧУ����� �༶
		school.add(classRoom1);
		school.add(classRoom2);
		school.add(classRoom3);
		
		//����
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