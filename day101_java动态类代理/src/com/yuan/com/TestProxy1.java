package com.yuan.com;
import java.util.ArrayList;
import java.util.Collection;

// ��һ�������������Ǹ���  ֻ�ܴ��� Collection��   ��������������κ�һ���������
public class TestProxy1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		Advice advice  = new Advice() {
			public void doBefore() {
				System.out.println("������ʼִ�У�ͳ��ʱ�俪ʼ.....");
			}
			public void doAfter() {
				System.out.println("����ִ�н�����ͳ��ʱ�����.....");
			}
		};
		
		ArrayList list  = new ArrayList();
		Collection col = (Collection) MyProxyUtils.getProxyObject(list, advice);
		col.add("hello");
		col.add("world !!!");
		System.out.println(col.toString());
		
		
	}
	
	


}
