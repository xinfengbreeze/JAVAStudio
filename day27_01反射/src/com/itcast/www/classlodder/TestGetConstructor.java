package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

//��Ľṹ
//  Class �ֽ����ļ�����
//  Field  ��Ա���� ����
//  Constructor  ���췽������
//  Method  ��������
/*
*  Constructor getConstructor()         //ֻ�ܻ��public���ε��޲ι�����
*  Constructor getConstructor(Class<?>...classobj)
*  Constructor[] getConstructors()		// ���ȫ�� public���εĹ�����
*  Constructor getDeclaredConstructor() //���  �޲ι�����    ���� ���η�
*  Constructor getDeclaredConstructor(Class<?>...classobj)
*  Constructor[] getDeclaredConstructors()  ���  ������й�����    �������η�
*  
*  ͨ��  Construct�������  ��newInstance(....)������������
*/
public class TestGetConstructor {
  public  static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	  //1������ֽ����ļ�����     Class
	  Class cc = null;
		 cc  = Class.forName("com.itcast.www.classlodder.Person");
	//���  public �޲ι���
	  Constructor cons1 = cc.getConstructor();
	  System.out.println(cons1);
	  
	//���  public  �в���������
	  Constructor cons2 = cc.getConstructor(String.class ,int.class,String.class);
	  System.out.println(cons2);
	  
	//���  public���ε�ȫ��  ������
	  Constructor[] cons3 = cc.getConstructors();
	  System.out.println( Arrays.toString(cons3) ); 
	  
	// ���  �в���������    �������η�    ��ʹ����  private����  Ҳ�ܻ�ȡ��	  
	//���ָ��  ����û���ҵ�Ҳ�ᱬ�쳣   java.lang.NoSuchMethodException
	  Constructor cons4 = cc.getDeclaredConstructor(String.class,String.class ,int.class );
	  System.out.println(cons4);
	  
	 //��� ȫ��������   �������η�
	  Constructor[] cons5 = cc.getDeclaredConstructors();
	  System.out.println( Arrays.toString(cons5) );  
	  
	  
	  //�û�õĹ�����  ����ʵ������
	  //������  ��public���εĹ�����  ��ʹ  ������  ���췽�� Ҳ����ֱ�Ӵ�������      �������Ƚ�����������Ϊ�ɷ���   .setAccessible(true)
	  //������쳣  ava.lang.IllegalAccessException
	  cons4.setAccessible(true);
	  Person pp = (Person)cons4.newInstance("С��","����",25);
	  System.out.println(pp);
  }
}
