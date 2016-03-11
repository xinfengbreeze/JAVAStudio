package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// ��Constructor   Field    һ��  ���� ��������
//  Method  ��һ�㲻һ��  getMethod()���Ի��  ����̳�����public���εķ���


public class TestGetMethod {
	  public static void main(String[] args) throws Exception{
		  //1�� ����ֽ����ļ�����
		  Class c = Class.forName("com.itcast.www.classlodder.Person");
		  //2�� ��ù����� ����   �� ��Ա��������   �� ��������
		  Constructor cons = c.getConstructor();
		  Field  fieldName = c.getDeclaredField("name");
		  Method methodShow = c.getDeclaredMethod("show2", String.class);
		  //arg0 ��ʾҪ��õķ�������argn ��ʾ Ҫ��õķ����Ĳ��� 
		  //3����������
		  Object  obj  =  cons.newInstance();
		  
		  methodShow.setAccessible(true);
		  methodShow.invoke(obj, "����������������"); // ���� obj�Ķ����show2�������������  "����������������"
		  
		  //  c.getMethod("������"��Class...arg);
		  //  c.getDeclaredMethod("������"��Class...arg);
		  //  c.getMethods();
		  //  c.getDeclaredMethods();
		  
		  //invoke �� ����
	  }
}
