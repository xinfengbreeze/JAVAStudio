package com.itcast.www;

public class TestSystem {
	public static void main(String[] args) throws Throwable{
		testGc();
		testIfo();
		testExit();
	}
	
	public static void testGc() throws Throwable{
		Person p  = new Person();
		p.setName("张三");
		System.out.println(p.toString());
		p  = null;
		System.gc();
		//自动的垃圾回收 是  JVM调用  对象的 finalize()方法  （该方法内部调用了super.finalize()）,所以是自下向上对象回收
		//手动调用 gc()   告诉jvm尽快进行垃圾回收     还是调用finalize()
		//一般不建议这么做    应为垃圾回收也会抢占cpu资源 
	}
	
	public static void testExit(){
		System.out.println(System.currentTimeMillis());// 是相对 1970-1-1-0时的时间差值  毫秒为单位
		System.out.println("hello");
		System.exit(0);   //这里无论传入是几 都会立即停止虚拟机    一般传入的是0  表示正常关闭     其它表示 异常关闭
		System.out.println("hello");
	}
	
	public static void testIfo(){
		System.out.println(System.getenv());
		System.out.println(System.getenv("JAVA_HOME"));
	}
}
  class  Person {
	  String name ;
	  //重写 finalize（）方法
	  @Override
	protected void finalize() throws Throwable {
		System.out.println("回收对象了");
		super.finalize();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "person [name=" + name + "]";
	}
	  
  }