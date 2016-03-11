package com.itcast.www.classlodder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 和Constructor   Field    一样  都有 几个方法
//  Method  有一点不一样  getMethod()可以获得  父类继承来的public修饰的方法


public class TestGetMethod {
	  public static void main(String[] args) throws Exception{
		  //1、 获得字节码文件对象
		  Class c = Class.forName("com.itcast.www.classlodder.Person");
		  //2、 获得构造器 对象   、 成员变量对象   、 方法对象
		  Constructor cons = c.getConstructor();
		  Field  fieldName = c.getDeclaredField("name");
		  Method methodShow = c.getDeclaredMethod("show2", String.class);
		  //arg0 表示要获得的方法名，argn 表示 要获得的方法的参数 
		  //3、创建对象
		  Object  obj  =  cons.newInstance();
		  
		  methodShow.setAccessible(true);
		  methodShow.invoke(obj, "哈哈哈哈！！！！"); // 调用 obj的对象的show2方法并传入参数  "哈哈哈哈！！！！"
		  
		  //  c.getMethod("方法名"，Class...arg);
		  //  c.getDeclaredMethod("方法名"，Class...arg);
		  //  c.getMethods();
		  //  c.getDeclaredMethods();
		  
		  //invoke ： 调用
	  }
}
