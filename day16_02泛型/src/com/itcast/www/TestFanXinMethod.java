package com.itcast.www;

public class TestFanXinMethod {


	public static void main(String[] args) {
	TestTool<Integer>  t   = new TestTool<Integer>();
	System.out.println(t.show("hah"));     //�ڷ����ϲ���ָ��  ����
	System.out.println(t.show(false));
	System.out.println(t.show(8888)); 
	}

}
class  TestTool <T>{
	public  <E>  E show(E e){    // ���ͷ�����   ���Ͷ����ڷ���ֵǰ    �����Ժ���ķ��Ͳ�һ��     
		return e;
	}
}