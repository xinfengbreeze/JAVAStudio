package com.itcast.www;

public class TestMath {
	public static void main(String[] args){
		//Math��ķ������Ǿ�̬����
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.ceil(12.3));   //����ȡ��
		System.out.println(Math.floor(12.58));  //����ȡ��
		System.out.println(Math.round(12.3));  //��������
		System.out.println(Math.round(12.8));
		System.out.println(Math.round(-12.3));  //-13.0 + 0.7  = -13+1  = -12
		System.out.println(Math.abs(-8));		//����ֵ
		System.out.println(Math.max(2, 3.3));   //���ֵ
		System.out.println(Math.min(2,3.3));
		
		System.out.println(Math.pow(2,3));		//������
		System.out.println(Math.sqrt(4.4));		//ƽ����
		
		System.out.println((int)(Math.random()*100 +1));  // �����   [0--1)
	}

}
