package com.itcast.teststring;

import java.util.Scanner;

public class TestString3 {
	public  static void main(String[] args){
		 //�ҳ�  �ַ����е�     ĳ��  �ֶγ��ֵĴ���
		Scanner  scan  = new Scanner(System.in);
		System.out.println("�������ַ���");
		String s1 =  scan.nextLine();
		System.out.println("����Ҫ���ҵ��ֶ�");
		String s2  = scan.nextLine();
		int count =0;
		int index =0;
		while( (index= s1.indexOf(s2,index) ) != -1){
			index +=s2.length();
			count++;
		}
		System.out.println("һ��������"+count+"��");
	}
}
