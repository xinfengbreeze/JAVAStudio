package com.itcast.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	//Iterator ���� ֻ��������     ����List���� �������е� ListIterator
	// ������˿�����ǰ����    hasPrevious()   previous()    add()
	// ���� ��Ҫ��ǰ����  ������������     ������û��ʲôʵ�ʵ�������   �������õĺ���
	
	
	//�ڼ��ϵ����Ĺ�����   ���ϱ������Ըı�  Ԫ��
	//������� �� 1���õ������� Iterator��remove()   ��ListIterator��add()
	//       2�� ��   ��ͨ�� forѭ������    ���ϱ���Ϳ��Ըı�Ԫ�ص�ֵ��    , ��ǿfor������  ��Ϊ���ĵײ㻹�ǵ����� 
	//
	public static void main(String[] args) {
		List  list  = new ArrayList();
		list.add("hello");
		list.add("java");
		list.add("java1");
		list.add("world");
		
		ListIterator  it = list.listIterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.equals("java")){
				//list.add("andorid");//ConcurrentModificationException  �����޸��쳣
				it.add("android");    //�������ڼ��ϵ������Ӷ�����   ��ǰ�����Ľڵ�������
			}
			if(s.equals("java1")){
				it.remove();       //ɾ����ǰ�����Ľڵ�
			}
		}	
		//����ĳ����Ѿ������������  
		while(it.hasPrevious()){
			System.out.println((String)it.previous());
		}

	}

}
