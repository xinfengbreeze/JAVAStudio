package com.itcast.www;

public class TestFanXinInterface {

	public static void main(String[] args) {
	Mytest  t  = new Mytest();
	System.out.println(    t.show("java")   );
		
	Mytest22<Integer>  t2  = new Mytest22<Integer>();
	System.out.println(  t2.show(888));
	}

}
//���ͽӿڵ�  ����ʵ��  
//1�� �ڽӿڵ�ʵ������  ָ��  ���͵�����
class  Mytest  implements TestInterface<String>{

	public String show(String t) {
		return t;
	}
}

//2�����������ʱ��ָ��
class  Mytest22<T>  implements TestInterface<T>{

	public T show(T t) {
		return t;
	}
}
