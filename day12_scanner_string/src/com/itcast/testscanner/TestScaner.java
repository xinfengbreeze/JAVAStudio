package com.itcast.testscanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestScaner {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner�ǻ���������ʽ���ı�ɨ����
		//���� ���췽��   ���� ���� �ַ���  �� ������InputStream��File����
		Scanner	scanner  =new Scanner(System.in);
		

		//int a = scanner.nextInt();
		//int b = scanner.nextInt();
		//System.out.println("a="+a +", b="+b);
		//����  7788 888
		//��� a=7788, b=888      ������Ĭ���ǰ��� �հ׷����ո� ��tab���س��� �����и��
		
		
		//int a = scanner.nextInt();
		//String s =scanner.nextLine();
		//System.out.println(a +s);
		//�������ֻ����������һ��  ��Ϊ ���������������ֵ�ʱ��   Ҫ�س�һ��     ������NextLine������ �س�����\r\n����Ϊ������־��
		//��������Ϊ��������һ��Ҳ������  ����  ����333�س�    ���333�س�
		
		
		// ���ļ�
		Scanner scan = new Scanner(new File("d:/testScanner.txt"));
		while(scan.hasNextLine()){
			String ss = scan.nextLine();
			System.out.println(ss);
		}
		
		
		String content = "����һ��   scanner��ȡ�ַ���";
		Scanner scan2= new Scanner(content);
		String  s2  = scan2.next();
		System.out.println(s2);
		//���� ��������           ����һ��                 ���������û�����ٴ�֤��Ĭ������   �հ׷�  ��Ϊ�и��׼��
		
	}

}
