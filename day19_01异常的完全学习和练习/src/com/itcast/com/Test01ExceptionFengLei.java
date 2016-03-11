package com.itcast.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;

// �쳣������  һ�������Ƿ�������Ҫ��׼
// java���쳣���ŵ�  ����ʹ������ӽ�׳��ȫ                ���Ǵ����쳣�ή��  ����Ч��

//  Throwable  ���쳣�ĳ���      
//   ----Error   ����       �������������    ϵͳ������
//   ----Exception  �쳣     �����ǵĳ����µ�       ������     �������쳣 ��checked ��    ��  �������쳣��RuntimeExcetpion��
// �������쳣       ���봦��Ȼ  �޷�ͨ������        �����һ��˼��      ��û�����ƴ�����Ĵ��벻�ܱ����У�
// �������쳣        ���Բ�����     ����ͨ����������      ���������п��ܳ���  


// �쳣��----�������׳�----   1��������� ��ϵͳ�Զ�����   �쳣�����׳�    2���г���Ա�Լ������쳣������throw�׳�
// �쳣��----����ʹ���----   1�������쳣û���ֶ�����   ��������Զ����񲢴��� 
//						 2����try....catch...������
//						 3�� ��throws�׳��е�����  ����


public class Test01ExceptionFengLei {

	public static void main(String[] args) {
		
		//testRuntimeException1();
		
		testRuntimeException2();
		
		try{
			testRuntimeException3();
		}catch(Exception e){
			System.out.println("03�����쳣��");
		}
		
		testException1();
		testException2();
		testException3();
		
	}
	
	//JVM�Զ�����  RuntimeException
	public  static void testRuntimeException1(){
	//�������� ArithmeticExcetion,����RuntimeException������     ���Բ�����һ�����Ա�������
	// ����һ�� ����JVM�Զ�����     1�� ��ӡ�쳣׷��ջ�е���Ϣ����׼�������   2������ֹͣ��������
		int a= 100;  
		a = 100/0;			//java.lang.ArithmeticException: / by zero
		System.out.println(a);
	}
	
	// �ֶ�����  RuntimeException    ��try...catch
	// ��try�еĴ�������쳣    try���Ǿ��Ժ�Ĵ��붼����ִ����    ֱ������ ���쳣ƥ���catch��ȥִ��
	// ִ����catch������Ժ� ��������ִ��  
	// ���򲻻���Ϊ�쳣��ֹͣ
	public static void testRuntimeException2(){
		int a= 100;
		try{
		a = 100/0;	
		System.out.println("02û�г����쳣");
		}catch(ArithmeticException e){
			System.out.println("02�����쳣��");
		}
		System.out.println(a);
	}
	
	
	// ͨ��  throws  �׳��쳣  �õ����ߴ���            ��Ȼ����RuntimeException  ���Բ�����    Ҳ����ͨ������
	// ��Ȼ����ô������   �����쳣�������Ĵ���Ҳ���ᱻִ����
	//����ֻ��������  ���ܽ�����쳣  ���׸�������
	public static void testRuntimeException3() throws ArithmeticException {
		int a= 100;
		a = 100/0;	
		System.out.println(a);
	}
	
	// ����   �����ڵ��쳣
	public static void testException1(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyy-MM-dd");
		try {
			sf.parse("hahah");     //���Ǳ��봦���  ��Ȼ�޷�����
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
	// �Զ���    �쳣���� 
	// javaֻ�ṩ��һЩ���õ�  �쳣      ��ʵ�ʿ��������ǵ���Ŀ  ҵ���߼��ϲ�����һЩ�������   ��������Ҫ�Զ���һЩ�쳣
	//����   �ɼ���������  ������
	//  �Զ���  �������쳣         �̳� Exception      	��д�޲� ������   ���вι�����
	//  �Զ��� �������쳣          �̳�RuntimeException 	 ��д  �޲ι�����   ��  �вι�����
	public static void  testException2(){		
		int score =-3;
		if(score < 0){
			MyException  e  = new MyException("��������Ϊ����"); //����Ĳ������մ���Throwable��message����
			try {
				throw  e;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else{
			score =0;
		}
	}
	
	
	//throw�ֶ����쳣 
	//  throw   ����   �ֶ��Ľ�     ���򴴽�һ���쳣�����׳�
	// ��throw�׳��Ķ���  ���������ַ�ʽ   һ��  try..catch...    ����һ��  throws
	
	//�����Ǻ�JVM��   ĳ�δ���    �����쳣��ʱ��            �����  �����쳣�����׳�
	public static void  testException3(){		
		int a =0;
		if(a ==0){
			Exception  e  = new Exception("������Ϊ0");
			try {
				throw  e;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else{
			a = 2/a;
		}
	}
	
}

class  MyException  extends Exception{
	//��д�޲ι�����
	public MyException() {
		super();

	}
	//��д�в���������
	public MyException(String message) {
		super(message);
	}
	
}
