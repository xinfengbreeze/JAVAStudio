package com.itcast.www;

import java.util.ArrayList;
import java.util.List;

// List�����������        �����Ա����ظ���Ԫ��   
// List�� Collection ������������Ϊ����
// ����List��Collection����   һЩ �����������ķ���

//��Ȼ ���  �������������������е������ͻᱨ   ָ��Խ���쳣
public class TestList {
	public static void main(String[] args){
		List  list  = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");  //����ظ���Ԫ��
		
		//Collection����ͨ��toArray()����    ����  Iterator������
		//����  List��������ķ��� �� ������ ��get(index)��size()��ϱ���    �����������е�ListLterator������
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}
		
		List  list2  = new ArrayList();
		list2.add("����");
		list2.add("����");
		
		//�������� ��� ����   �൱һ����
		//list.add(5,"����");   //IndexOutOfBoundsException  ָ��Խ���쳣  ӦΪ��ǰ��������0--3
		list.add(4,"����");
		list.addAll(0,list2);
		System.out.println();
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}		
		//ɾ��      ע�ⷵ�ص��Ǳ�ɾ����Ԫ��
		list.remove(5);
		//��        ע�ⷵ�ص��� ���޸ĵľ�Ԫ��
		list.set(0, "��һ");
		
		System.out.println();
		for(int i=0; i<list.size();i++){
			System.out.print((String)list.get(i)+";");
		}
		
		//��   indexOf(..) lastIndexOf(..)   get(..)
		System.out.println();
		System.out.println( list.indexOf("����"));
		System.out.print((String)list.get(2));
	
	}

}
