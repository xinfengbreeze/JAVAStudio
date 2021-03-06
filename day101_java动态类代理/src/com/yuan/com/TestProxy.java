package com.yuan.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public class TestProxy {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//1、创建InvocationHandler对象  重写invoke方法
		InvocationHandler  handler = new InvocationHandler(){
			ArrayList list = new ArrayList();  // 创建目标对象    当代理对象调用一个方法的时候 
			//目标对象也要调用 相同的方法，但是可以在方法前后加上   其他功能，如这里的统计时间
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				long beginTime = System.currentTimeMillis(); // 记录开始时间
				Object obj  = method.invoke(list, args); // 我们这里调用自己的 目标类的对应的方法
				long endTime =System.currentTimeMillis();
				System.out.println(method.getName()+"方法用时："+(endTime - beginTime) +"ms");
				return obj;
			}
		};
		//2、创建 目标类的代理 类的 对象
		Collection  col =(Collection) Proxy.newProxyInstance(Collection.class.getClassLoader()
				,new Class[]{Collection.class}, 
				handler);
		//3、调用代理类的方法
		col.clear();
		col.add("Hello");
		col.add("world");
		col.add(" java");
		col.add(" !!!");
		col.remove("world");
		System.out.println("集合内容："+ col.toString());
		
}
}
/*
客户给了我们一个编写好的类 ，现在有一个需求  就是在我用该类的时候，要 统计改类中每一个方法执行的时间
方案一：修改客户的类方法，在每一个方法里面的开始和结尾加上时间，统计开始时间和结束时间（不好，客户很不高兴）
方案二：写一个类继承客户的类，重写每一个方法，并且在每一个方法里面的开始和结尾加上时间，统计开始时间和结束时间（如果方法很多，我们会很累）
方案三：使用动态代理，用Proxy类将客户的类，生成一个动态的代理类，这要我们调用动态代理类的方法，代理就会调用InvocationHandler的invoke方法
		这样我们这要重写  invoke放就可以了。（简洁，方便，上档次）
方法步骤：
1、创建一个InvocationHandler对象：以便在Proxy在创建代理类的时候用到，它的作用是当代理类调用任何的方法都可以调用该InvocationHandler的invoke方法，这样就可以加以处理
2、创建一个类的动态代理的对象:这里我们以 Collection为目标类，创建它的代理类对象如下（Proxy创建代理类 的 目标类必须是接口，如果不是接口的可以使用GLIB类创建代理类，它支持）
	当然比如ArrayList不是接口，那么可以这样ArrayList.class.getInterfaces();
Collection  col =(Collection) Proxy.newProxyInstance(Collection.class.getClassLoader()
				,new Class[]{Collection.class}, 
				handler);
3、调用 代理类对象的方法

动态代理作为开发者，就是关键   编写invoke方法的内容（实现在原有方法上增加功能）

代理类的运行过程
目标类    ----（Proxy创建代理类）---->    代理类          ---（创建对象）--->    代理类对象         --程序员使用-->     带对象的方法      ---内部调用--> invoke方法---程序员去调用---> 标类对象的 方法
代理类内部的放方法源码
int size(){
retrun handler.invoke(this,this.getClass.getMethod("size",null));
}
可以看出这里代理类就是转了一下手，将参数交给了inovke方法；
再看invoke方法
Object invoke(Object proxy, Method method, Object[] args)的参数
arg0: 代理类对象    arg1：方法对象    arg2: 方法的参数
*/