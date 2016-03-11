package com.itcast.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

// 需求分析
// 在对学生类进行增删改查操作的时候首先进行   权限检查   操作完要有操作记录
// 用动态代理来做
//JDK提供的代理只能针对接口做代理。我们有更强大的代理cglib

public class Test {
	public static void main(String[] args){
		StudentDaoInterface  stuDao  = new StudentDao();
		stuDao.add();
		stuDao.delete();
		stuDao.update();
		stuDao.find();
		// 开的时候我没   权限检查和操作记录的功能
		
		//现在用动态代理   让他去实现   这些我没有实现的功能
		
		StudentDaoInterface  stuDao22 = (StudentDaoInterface)Proxy.newProxyInstance(stuDao.getClass().getClassLoader(),
								stuDao.getClass().getInterfaces(),
								new MyInvocationHandler(stuDao));
		
		stuDao22.add();
		stuDao22.delete();
		stuDao22.update();
		stuDao22.find();
		
	}
}


// 调用帮助类  帮我们调用原来类的方法
class MyInvocationHandler  implements InvocationHandler{
	public Object targetObj = null; 
	public MyInvocationHandler(Object targetObj){
		this.targetObj = targetObj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("代理对象实现    权限检查");
		Object obj = method.invoke(targetObj, args);
		System.out.println("代理对象实现    操作记录");
		return obj;
	}
	
}