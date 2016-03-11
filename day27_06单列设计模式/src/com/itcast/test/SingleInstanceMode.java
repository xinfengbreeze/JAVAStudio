package com.itcast.test;

import java.io.IOException;

/*
 * �������ģʽ˼��   ����֤�������ڴ���ֻ��һ������
 * 			��ô��α�֤���ڴ���Ψһ�ԣ�
 * 				1�����е�   ���췽��˽��
 * 				2���Լ�����һ��  ˽�е�  ��̬  ����
 * 				3���ṩһ��  ������   ��̬��   ��ȡ����
 *            ����ʽ������ص�ʱ���  ��������  ��ʵ�ʿ������ö���ʽ��
 *            ����ʽ���õ�ʱ��û�вŴ����������Ե�ʱ��ῼ  ����ʽ���ص㣩
 *            			A��������   :(��ʱ����)
 *            			B���̲߳���ȫ   ������̵߳��û�ȡ�����ķ���ʱ���п�������̲߳���ȫ��
 *            				Ϊ�˽�������������� ��ȡ���еķ����ϼ���ͬ�� synchronized
 * 
 * */
public class SingleInstanceMode {
	public static void  main (String[] args){
			Student stu2  = Student.getInstance();
			Student stu1  = Student.getInstance();
			System.out.println(stu1==stu2);
			
			Teacher t1 = Teacher.getInstance();
			Teacher t2 = Teacher.getInstance();
			System.out.println(t1==t2);
			
			
			
			//Runtime ����ǲ��õ���  ����ʽ �������ģʽ
			Runtime   rt  = Runtime.getRuntime();
			try {
				rt.exec("notepad");     // ����DOS����
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
/*
Runtime  ���ǲ��õ��� ����ʽ�������ģʽ     

public class Runtime {
private static Runtime currentRuntime = new Runtime();

public static Runtime getRuntime() {
    return currentRuntime;
}*/


//����ʽ
class Student{
	//���еĹ��췽��˽��
	private Student(){
		
	};
	//�Լ�����һ��˽�еľ�̬����
	//Ҫ����static    Ϊ������ľ�̬�������Ե���
	// ����private  	��Ϊ����粻����ֱ�ӵ���
	private static Student stu = new Student();
	//�ṩһ�������ľ�̬�Ļ�ȡ����
	//������new������ôֻ��   ͨ����ľ�̬����
	public  static Student getInstance(){
		return stu;
	}	
}


//����ʽ
class  Teacher{
	private Teacher(){
		
	}
	private static Teacher  teacher = null;
	
	 public static synchronized Teacher  getInstance(){   // ����Ҫ����synchronized
		if(teacher ==null){
			//������������߳̽���Ļ������Բ���ȫ
			teacher  = new Teacher();
		}
		return teacher;
	}
}

