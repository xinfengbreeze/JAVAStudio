package om.itcast.com;

import java.util.ArrayList;

public class TestContain {
	public static  void  main(String[] args){
		ArrayList  list  = new ArrayList();
		list.add(new Student("����",33));
		list.add(new Student("����",33));
		list.add(new Student("����",55));
		list.add(new Student("����",44));
		list.add(new Student("����",33));
		list.add(new Student("����",44));
		
		//ȥ����������ͬ��Ԫ��
		ArrayList newList  = new ArrayList();
		for(int i =0; i<list.size();i++){
			Student  stu = (Student)list.get(i);
			if(!(newList.contains(stu))){   //�ж�һ�������������  ���Ԫ�ص��¼�����
				//�������ע�����    contains�ײ���õ���equals����   �������û����д�÷���    ���õ���Object��equals()����
				//���Ƚϵ���    ����ĵ�ֵַ    ����   ����һ��  
				//����Ҫʵ��  contains����  ������дequals��������
				newList.add(stu);
			}
		}
		
		for(int i =0; i<newList.size();i++){
			Student  stu = (Student)list.get(i);
			System.out.println(stu.toString());
		}
		
	}
	
}
class Student{
	String name ;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
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
	
	
}