package com.itcast.stringbuffer;




//ΪʲôҪ�� StringBuffer
//���� String  �ڶ��ַ�������   �ı��ʱ��   ������ܶ����õ��ַ���            �����֮ ��ʱ�Ŀռ�
//��StringBuffer  �����ڲ�����һ�� ���ȿɱ���ַ�������  �����ַ�����     
// �������ı��ַ��������ݵ�ʱ��  ���ǲ�����  �ַ�������   �Ͳ�����  ��������  �����ܶ� ���õ��ַ�����
public class TestStringBuffer {
	public static void main(String[] args){
		//testConstructor();
		testAppend();
	}
	
	//���Թ��췽��
	public static void  testConstructor(){
		StringBuffer sb1  =new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);  //int capacity
		StringBuffer sb3 = new StringBuffer("hello");	// CharSequence
		StringBuffer sb4 = new StringBuffer(new StringBuilder("helloJava"));//CharSequence
		System.out.println("length:"+sb1.length() +"capacity:"+sb1.capacity());
		System.out.println("length:"+sb2.length() +"capacity:"+sb2.capacity());
		System.out.println("length:"+sb3.length() +"capacity:"+sb3.capacity());
		System.out.println("length:"+sb4.length() +"capacity:"+sb4.capacity());
	}
	public static void  testAppend(){
		//StringBuffer��ʵ���ڲ�  �����˻�����    append(Object  obj),  
		//��append����ֻ�Ǹı��˻�����  �����صĻ��Ǳ���
		StringBuffer sb1  =new StringBuffer();
		sb1.append("hello");					//׷��
		sb1.append(new byte[]{97,65,});
		StringBuffer sb2= sb1.append(188);    
		sb1.append(3.33f);						
		sb1.insert(1, "AAA");					//����
		System.out.println(sb1);
		System.out.println(sb2==sb1);   
		
		sb1.deleteCharAt(1);					//ɾ��
		sb1.delete(1,3);
		sb1.delete(0, sb1.length());			//ʵ�����
		System.out.println(sb1);
		
		sb1.append("hello").append("java");
		
		sb1.replace(5,9,"world");     			//�滻
		System.out.println(sb1);
		
		System.out.println(sb1.lastIndexOf("lo"));				//��
		
		sb1.reverse();
		System.out.println(sb1);				//��ת		
		
		String string = sb1.substring(2,8);		//��ȡ
		System.out.println(string);
		
		
	}
}
