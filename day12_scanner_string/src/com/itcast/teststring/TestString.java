package com.itcast.teststring;

import java.io.UnsupportedEncodingException;

public class TestString {
	//�ַ���     ������   ��������  ���Ƿ� �������е��ַ���    �������еģ����û�оʹ����µġ�....��
	public static void main(String[] args) throws UnsupportedEncodingException{
		 String  s1 = "hello";
		 String s2  = new String("hello");
		 System.out.println(s1 ==s2);    //false
		 System.out.println(s1.equals(s2));//true
		 //�������������������      s1 ָ����� ���еĶ���   s2ָ�����   �������е�  �ַ�����hello��
		 
		 
		 byte[]  buff  = new byte[]{97,98,99,100,101,102,103};
		 char[]  c  =new char[]{'w','e','f','g','b'};
		 String s3  = new String();
		 String s4  = new String(buff);
		 String s5  = new String(buff,0,3);
		 String s6  = new String(buff,0,3,"utf-8");
		 //.........�����ܶ�
		 
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equalsIgnoreCase("HEllo"));
		// System.out.println(s1.contains("ell"));
		 System.out.println(s1.startsWith("he"));
		 System.out.println(s1.endsWith("lo"));
		 
	}
}
