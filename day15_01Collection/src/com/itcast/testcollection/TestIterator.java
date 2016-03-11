package com.itcast.testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


//һ��Ҫ��ס ��������Դ��  ������������ ��������������      ���ǳ��Ȳ��ɱ�
//        ����ֻ�ܴ��Ӧ���������� �������Ƕ���   �����ǳ��ȿɱ�
// ������
// 1�� �ڵ����Ĺ�����   ���ϱ���    �ǲ����Ա仯�ģ���ɾ�Ĳ飩  �����򱨳��쳣 CurrentModifiedExecption  �����޸��쳣
//	2�����������иı�  ����Ԫ����ָ��Ķ����������  ���Ե�  Ҳ����Ч��
//�ڼ��ϵ����Ĺ�����   ���ϱ������Ըı�  Ԫ��
//������� �� 1���õ������� Iterator��remove()   ��ListIterator��add()
//       2�� ��   ��ͨ�� forѭ������    ���ϱ���Ϳ��Ըı�Ԫ�ص�ֵ��    , ��ǿfor������  ��Ϊ���ĵײ㻹�ǵ����� 
//

public class TestIterator {
	public static void main(String[] args) {
		Collection co  = new ArrayList();
		co.add(new Student("����",33));
		co.add(new Student("����",44));
		co.add(new Student("����",55));	
		
		Iterator  it  = co.iterator();
		while(it.hasNext()){
			Student  stu = (Student)it.next(); // �� �����е�Ԫ�أ����ã������Ƕ��󣩴���stu
			System.out.println(stu.toString());
			stu.setAge(888);				//�ı�����ָ�����������ǿ��Ե�   ��������Ч��
			//��䲢û�иı� ���ϵ�Ԫ��  ��Ϊ���ϴ�ŵ��Ƕ��������   ������ı���Ǽ�����Ԫ����ָ��Ķ��������
			//�����ǿ��Ե�Ҳ����Ч��
			stu  =new Student("����",66);		//��䲢����ı� ���ϵ�Ԫ��
			// co.add(new Student("����",66));//�ڵ����Ĺ����� �����Ըı伯��   ���ᱨ�쳣 CurrentModifiedExecption
			System.out.println(stu.toString());
		}
		
		List list = (List)co;
		System.out.println(((Student)list.get(1)).toString());
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
	
	
}
