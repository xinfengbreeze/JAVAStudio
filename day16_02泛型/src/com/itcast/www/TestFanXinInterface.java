package com.itcast.www;

public class TestFanXinInterface {

	public static void main(String[] args) {
	Mytest  t  = new Mytest();
	System.out.println(    t.show("java")   );
		
	Mytest22<Integer>  t2  = new Mytest22<Integer>();
	System.out.println(  t2.show(888));
	}

}
//泛型接口的  两种实现  
//1、 在接口的实现类上  指定  泛型的类型
class  Mytest  implements TestInterface<String>{

	public String show(String t) {
		return t;
	}
}

//2、创建对象的时候指定
class  Mytest22<T>  implements TestInterface<T>{

	public T show(T t) {
		return t;
	}
}
