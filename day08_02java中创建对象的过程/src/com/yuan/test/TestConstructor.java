package com.yuan.test;
/**
 * �����Ķ���Ĺ���   new student()
 * new �ؼ���  Ϊ����������ڴ�ռ�
 * student() ִ�й�����
 * 1��ִ��super(....)����Ĺ�����    ȥ��������Ķ���
 * 2����ʼ�������еĳ�Ա����          Ĭ�ϳ�ʼ������ʾ��ʼ��
 * 3�����������Ƿ��й�������  ����� ��ִ�й�������    
 * 4��ִ�� �������е�����  ����
 * 
 * �����ʵ��֤�������ϴ�������Ĺ���       ���̷���
 *���н��
 *������Person�Ĺ���������Student�ĸ���Person�������и��ײ����ж��ӣ�����JAVA�� ���ֲ��ʼ������
 *������X�Ĺ���������X����
 *ִ����Student���������еĴ��룬 ���������еĴ����൱���Ǹ������й���������ȡ�����Ĺ�ͬ�Ĵ���
 *������Student�Ĺ���������������
 *
 *
 *��ʵ�ܺ����   ��  ��Щ��ƶ��Ƿ�����ʵ����Ĺ��ɵ�     ���и������ж���      �ȴ����ͳ�ʼ����Ա�����ſ���  ִ���������루ӦΪ�п����õ�����Щ������
 */
public class TestConstructor {
		public static void main(String[] args){
			Student stu = new Student();
		}
}

class  X {
	public X(){
		System.out.println("������X�Ĺ���������X����");
	}
}
class  Person{
	public  Person(){
		System.out.println("������Person�Ĺ���������Student�ĸ���Person�������и��ײ����ж��ӣ�����JAVA�� ���ֲ��ʼ������");
	}
}
class Student extends Person{
	X  x = new X(); //��Ա����
	
	{//��������
		System.out.println("ִ����Student���������еĴ��룬 ���������еĴ����൱���Ǹ������й���������ȡ�����Ĺ�ͬ�Ĵ���");
	}
	
	public Student(){//������
		
		System.out.println("������Student�Ĺ���������������");
	}
}
