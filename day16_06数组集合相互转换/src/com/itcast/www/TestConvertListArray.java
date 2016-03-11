package com.itcast.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConvertListArray {
//���Ϻ�����  ֮���ǿ������ת����
// 1������ת ���� �ü��ϵ�  toArray()
// 2������ת����  ��Arrays ��asList(T...e);  public static <T> List<T> asList(T... e);
// Ҫע�����  ����ת�ɵļ���   �ǲ�������ɾ������      �����޸�
	public static void main(String[] args) {
		List<String>  list1  = new ArrayList<String>();
		list1.add("hello");
		list1.add("java");
		
		Object[] arr1 = list1.toArray();  // ����ת����
		for(Object s : arr1){
			System.out.println((String)s);
		}
		
		String[]  arr2 = new String[]{"c","java","android"};
		List<String>  list2  = Arrays.asList(arr2);
		//list2.add("hello");    �����Խ���  ��ɾ����
		//list2.remove(1);    //java.lang.UnsupportedOperationException
		list2.set(0,"ccc");
		for(String s : list2){
			System.out.println(s);
		}

	}

}
