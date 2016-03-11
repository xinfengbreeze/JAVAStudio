package com.yuan.com;
import java.util.ArrayList;
import java.util.Collection;

// 上一个例子中我们那个类  只能代理 Collection类   现在我们想代理任何一个传入的类
public class TestProxy1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		Advice advice  = new Advice() {
			public void doBefore() {
				System.out.println("方法开始执行，统计时间开始.....");
			}
			public void doAfter() {
				System.out.println("方法执行结束，统计时间结束.....");
			}
		};
		
		ArrayList list  = new ArrayList();
		Collection col = (Collection) MyProxyUtils.getProxyObject(list, advice);
		col.add("hello");
		col.add("world !!!");
		System.out.println(col.toString());
		
		
	}
	
	


}
