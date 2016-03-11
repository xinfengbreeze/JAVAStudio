package com.itcast.tes02;

import java.lang.reflect.Field;

//ʹ�øù��������ʵ��    ��һ������   �ͱ�����   �ͱ�����ֵ       
//����ǿ�����ö���ı�������ֵ    ��ʹ���Ǳ����η�������
public class ReflactTools {
		public static void setValue(Object obj , String fieldName, Object value) throws Exception{
			//����ֽ����ļ�����  
			Class c = obj.getClass();
			// �����ĳ�Ա��������
			Field field  = c.getDeclaredField(fieldName);
			field.setAccessible(true);
			
			//���ö���ı���
			field.set(obj, value);
		}
}
