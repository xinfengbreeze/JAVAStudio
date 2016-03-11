package com.yuan.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyUtils {
	//获得代理类对象
	//方法就是 你传给我对象    和 建议advice(就是在方法前后执行的东西)   我就可以给你返回一个代理对象
	//然后你调用代理对象的方法我就可以  帮你调用目标对象的方法 和建议
	public static Object getProxyObject(final Object target,final Advice advice) throws InstantiationException, IllegalAccessException{
		//InvocationHandler对象
		InvocationHandler  handler  = new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				advice.doBefore(); //目标方法执行前
				Object obj = method.invoke(target, args);   //调用目标对象的对应方法
				advice.doAfter();//目标方法执行后
				return obj;
			}
		};
		//创建动态类对象
		Object  proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				handler);
		return proxy;
	}
}
