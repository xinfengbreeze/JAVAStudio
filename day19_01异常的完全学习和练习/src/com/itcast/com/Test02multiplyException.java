package com.itcast.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test02multiplyException {
// 多异常的处理
// 1 、一个异常一个try..catch..
// 2、 一个try...对应多个catch...
// 3、 一个try...对应一个catch(..|...|...  e)
// 4、 throws  ...,....,....
	public static void main(String[] args) {
	
		testExcetpion1();
		testExcetpion2();
		testExcetpion3();
		
		
		try {
			testExcetpion4();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// 多个try...catch...
	//缺点  ：   try...catch...太多不简洁
	public static  void testExcetpion1(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
		try {
			sf.parse("1999--4");
			System.out.println("01第一处没有报异常");
		} catch (ParseException e) {
			System.out.println("01第一处报异常");
		}
		
		try {
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("01第二处没有报异常");
		} catch (FileNotFoundException e) {
			System.out.println("01第二处报异常");
		}
	}
	
	// 一个try...对应多个catch...
	// try中的代码  有一句发生异常   就会停止运行try中该句代码的后面代码     
	// 拿着产生的异常对象  去一次匹配后面的catch   配到了就  进入catch中去执行 ，并且后面的其它catch就不在匹配了
	// 没有匹配到就   由JVM去处理
	
	//缺点：  一句发生异常   就会停止运行try中该句代码的后面代码
	public static  void testExcetpion2(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			try{
			sf.parse("1999--4");
			System.out.println("02第一处没有报异常");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("02第二处没有报异常");
			}catch(FileNotFoundException e){
				System.out.println("02第二处报异常");
			}catch(ParseException e){
				System.out.println("02第一处报异常");
			}catch(Exception e){
				//同级的  异常   顺序随便            父级异常向后面放   这里的Exception 就是前两个异常的父类
				System.out.println("02报异常");
			}
	}
	
	//一个try ..一个catch(...|...|...e)
	// try中的代码  有一句发生异常   就会停止运行try中该句代码的后面代码     
	// 拿着产生的异常对象  去一次匹配后面的catch   配到了就  进入catch中去执行 ，并且后面的其它catch就不在匹配了
	// 没有匹配到就   由JVM去处理
	
	//缺点： 多种异常对应一个  处理          异常信息不精确
	public static  void testExcetpion3(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			try{
			sf.parse("1999--4");
			System.out.println("03第一处没有报异常");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("03第二处没有报异常");
			}catch(FileNotFoundException |ParseException e){
				System.out.println("03产生异常");
			}
	}
	
	//trows  抛给  调用者  处理
	//整个方法   有一句代码发生异常    该代码以后的内容都不  执行了
	public static  void testExcetpion4() throws ParseException, FileNotFoundException{
		SimpleDateFormat  sf  = new SimpleDateFormat("yyyMMdd");
			sf.parse("1999--4");
			System.out.println("04第一处没有报异常");
			FileInputStream   fi = new FileInputStream("d:/fff/");
			System.out.println("04第二处没有报异常");
	}
}
