package com.itcast.www;
import java.util.ArrayList;
import java.util.Iterator;
// ΪʲôҪ��������
// ���ϵ�����ȱ��
//  1�����ϴ�����Object����   �Դ��뼯�ϵ�Ԫ��û������                �������򼯺��з���Dog��  �ٷ���Cat�����ǲ������
// 2������ȡ��Ԫ��Ҳ��Object    ����֪���Ҵ������ʲô���͵�Ԫ��      ��Ҫǿת    ���ת���˾ͻ��׳�ClassCastException
//  ���� ����Ͳ�ͬ     �ڴ�����ʱ��  ��ָ������Ԫ�ص�����    String[] str;    int[]   arr;
//  ���������    ����    
//  �������ڴ�����ʱ���   ָ������Ԫ�ص�  ����                ���Ǵ����Ԫ�����͵õ������ƣ�������ȡ����Ԫ�ص�����Ҳ��ȷ�ˣ�����ǿ��ת��
//  Ȼ��   ����з��͵�������û��  �����ʹ���ֵ    ��ô��Ĭ����Object���ͣ���������ǰ��д������ 
public class TestFanXin {
	public static void main(String[] args) {
		ArrayList<String>   list  = new ArrayList<String>();
		list.add("hello");   //���˷���    add(String s)  ������  add(Object obj);
		list.add("java");
		list.add("world");
		Iterator<String>  it  =  list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());  // ���˷����Ժ������صľ����㷺��ָ��������     ����Object��
		}
	}
}
  
