package com.itcast.split;

import java.util.Arrays;

public class TestSplit {

	public static void main(String[] args) {
		String  s = "aa,bb,cc,dd";
		String[]  strArray = s.split(",");
		System.out.println(Arrays.toString(strArray));
		
		s = "aa.bb.cc.dd";
		strArray = s.split("\\.");
		System.out.println(Arrays.toString(strArray));
		
		s = "aa  bb  cc      dd";
		strArray = s.split(" +");
		System.out.println(Arrays.toString(strArray));
		
		//����Ҫ�ر��ע��  ����   \   ӦΪ\��ת���ַ�    ���������ᵥ������    Ҫô\\��ʾ \   
		//  Ҫô \X   ��ʾת��� �ַ�         �� \.  ��ʾ.   \r ��ʾ�س�
		//  ���� ��Ϊ·���ָ�����ʱ�� Ҫ��  \\       
		// �������и��ʱ�����   �и��ַ�������    ��һ��\  ��Ҫ \\
		s = "aa\\bb\\cc\\dd";
		strArray = s.split("\\\\");
		System.out.println(Arrays.toString(strArray));

	}

}
