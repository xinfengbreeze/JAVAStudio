package com.itcast.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

// �������
// �ڶ�ѧ���������ɾ�Ĳ������ʱ�����Ƚ���   Ȩ�޼��   ������Ҫ�в�����¼
// �ö�̬��������
//JDK�ṩ�Ĵ���ֻ����Խӿ������������и�ǿ��Ĵ���cglib

public class Test {
	public static void main(String[] args){
		StudentDaoInterface  stuDao  = new StudentDao();
		stuDao.add();
		stuDao.delete();
		stuDao.update();
		stuDao.find();
		// ����ʱ����û   Ȩ�޼��Ͳ�����¼�Ĺ���
		
		//�����ö�̬����   ����ȥʵ��   ��Щ��û��ʵ�ֵĹ���
		
		StudentDaoInterface  stuDao22 = (StudentDaoInterface)Proxy.newProxyInstance(stuDao.getClass().getClassLoader(),
								stuDao.getClass().getInterfaces(),
								new MyInvocationHandler(stuDao));
		
		stuDao22.add();
		stuDao22.delete();
		stuDao22.update();
		stuDao22.find();
		
	}
}


// ���ð�����  �����ǵ���ԭ����ķ���
class MyInvocationHandler  implements InvocationHandler{
	public Object targetObj = null; 
	public MyInvocationHandler(Object targetObj){
		this.targetObj = targetObj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("�������ʵ��    Ȩ�޼��");
		Object obj = method.invoke(targetObj, args);
		System.out.println("�������ʵ��    ������¼");
		return obj;
	}
	
}