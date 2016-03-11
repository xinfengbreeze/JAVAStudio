package com.itcast.tes02;

import java.lang.reflect.Field;

//使用该工具类可以实现    给一个对象   和变量名   和变量的值       
//可以强制设置对象的变量变量值    即使他是被修饰符保护的
public class ReflactTools {
		public static void setValue(Object obj , String fieldName, Object value) throws Exception{
			//获得字节码文件对象  
			Class c = obj.getClass();
			// 获得类的成员变量对象
			Field field  = c.getDeclaredField(fieldName);
			field.setAccessible(true);
			
			//设置对象的变量
			field.set(obj, value);
		}
}
