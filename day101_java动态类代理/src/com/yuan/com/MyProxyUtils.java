package com.yuan.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyUtils {
	//��ô��������
	//�������� �㴫���Ҷ���    �� ����advice(�����ڷ���ǰ��ִ�еĶ���)   �ҾͿ��Ը��㷵��һ���������
	//Ȼ������ô������ķ����ҾͿ���  �������Ŀ�����ķ��� �ͽ���
	public static Object getProxyObject(final Object target,final Advice advice) throws InstantiationException, IllegalAccessException{
		//InvocationHandler����
		InvocationHandler  handler  = new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				advice.doBefore(); //Ŀ�귽��ִ��ǰ
				Object obj = method.invoke(target, args);   //����Ŀ�����Ķ�Ӧ����
				advice.doAfter();//Ŀ�귽��ִ�к�
				return obj;
			}
		};
		//������̬�����
		Object  proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				handler);
		return proxy;
	}
}
