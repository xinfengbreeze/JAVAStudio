package com.itcast.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test02multiplyException {
// ���쳣�Ĵ���
// 1 ��һ���쳣һ��try..catch..
// 2�� һ��try...��Ӧ���catch...
// 3�� һ��try...��Ӧһ��catch(..|...|...  e)
// 4�� throws  ...,....,....
	public static void main(String[] args) {
	
		testExcetpion1();
		testExcetpion2();
		testExcetpion3();
		
		
		try {
			testExcetpion4();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// ���try...catch...
	//ȱ��  ��   try...catch...̫�಻���
	public static  void testExcetpion1(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
		try {
			sf.parse("1999--4");
			System.out.println("01��һ��û�б��쳣");
		} catch (ParseException e) {
			System.out.println("01��һ�����쳣");
		}
		
		try {
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("01�ڶ���û�б��쳣");
		} catch (FileNotFoundException e) {
			System.out.println("01�ڶ������쳣");
		}
	}
	
	// һ��try...��Ӧ���catch...
	// try�еĴ���  ��һ�䷢���쳣   �ͻ�ֹͣ����try�иþ����ĺ������     
	// ���Ų������쳣����  ȥһ��ƥ������catch   �䵽�˾�  ����catch��ȥִ�� �����Һ��������catch�Ͳ���ƥ����
	// û��ƥ�䵽��   ��JVMȥ����
	
	//ȱ�㣺  һ�䷢���쳣   �ͻ�ֹͣ����try�иþ����ĺ������
	public static  void testExcetpion2(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			try{
			sf.parse("1999--4");
			System.out.println("02��һ��û�б��쳣");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("02�ڶ���û�б��쳣");
			}catch(FileNotFoundException e){
				System.out.println("02�ڶ������쳣");
			}catch(ParseException e){
				System.out.println("02��һ�����쳣");
			}catch(Exception e){
				//ͬ����  �쳣   ˳�����            �����쳣������   �����Exception ����ǰ�����쳣�ĸ���
				System.out.println("02���쳣");
			}
	}
	
	//һ��try ..һ��catch(...|...|...e)
	// try�еĴ���  ��һ�䷢���쳣   �ͻ�ֹͣ����try�иþ����ĺ������     
	// ���Ų������쳣����  ȥһ��ƥ������catch   �䵽�˾�  ����catch��ȥִ�� �����Һ��������catch�Ͳ���ƥ����
	// û��ƥ�䵽��   ��JVMȥ����
	
	//ȱ�㣺 �����쳣��Ӧһ��  ����          �쳣��Ϣ����ȷ
	public static  void testExcetpion3(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			try{
			sf.parse("1999--4");
			System.out.println("03��һ��û�б��쳣");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("03�ڶ���û�б��쳣");
			}catch(FileNotFoundException |ParseException e){
				System.out.println("03�����쳣");
			}
	}
	
	//trows  �׸�  ������  ����
	//��������   ��һ����뷢���쳣    �ô����Ժ�����ݶ���  ִ����
	public static  void testExcetpion4() throws ParseException, FileNotFoundException{
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			sf.parse("1999--4");
			System.out.println("04��һ��û�б��쳣");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("04�ڶ���û�б��쳣");
	}
}
