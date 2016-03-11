package com.itcast.www;

public class TestFanXinClass {
//  测试 泛型 类
	public static void main(String[] args) {
		Test<String ,Integer,String>  tt = 
				new Test<String, Integer, String>("zhangSan", 33, "张三");
		
		String s = tt.getIi();
		System.out.println(s);
		
		Integer a = tt.getNn();
		System.out.println(a);
		
		System.out.println(tt);

	}

}
//泛型类
class  Test<T,E,X>{
	T ii;
	E nn;
	X mm;
	public T getIi() {
		return ii;
	}
	public void setIi(T ii) {
		this.ii = ii;
	}
	public E getNn() {
		return nn;
	}
	public void setNn(E nn) {
		this.nn = nn;
	}
	public X getMm() {
		return mm;
	}
	public void setMm(X mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "Test [ii=" + ii + ", nn=" + nn + ", mm=" + mm + "]";
	}
	public Test(T ii, E nn, X mm) {
		super();
		this.ii = ii;
		this.nn = nn;
		this.mm = mm;
	}
	
	
}