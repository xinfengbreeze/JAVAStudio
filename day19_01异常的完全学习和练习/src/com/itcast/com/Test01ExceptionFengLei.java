package com.itcast.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;

// 异常处理是  一门语言是否成熟的重要标准
// java的异常的优点  可以使程序更加健壮安全                但是处理异常会降低  运行效率

//  Throwable  是异常的超类      
//   ----Error   错误       比如虚拟机崩溃    系统崩溃等
//   ----Exception  异常     有我们的程序导致的       它包含     编译期异常 （checked ）    和  运行期异常（RuntimeExcetpion）
// 编译期异常       必须处理不然  无法通过编译        这就是一个思想      （没有完善错误处理的代码不能被运行）
// 运行期异常        可以不处理     可以通过编译运行      但是运行有可能出错  


// 异常的----产生和抛出----   1、程序出错 由系统自动产生   异常对象并抛出    2、有程序员自己创建异常对象并用throw抛出
// 异常的----捕获和处理----   1、运行异常没有手动捕获   有虚拟机自动捕获并处理 
//						 2、用try....catch...捕获处理
//						 3、 用throws抛出有调用者  处理


public class Test01ExceptionFengLei {

	public static void main(String[] args) {
		
		//testRuntimeException1();
		
		testRuntimeException2();
		
		try{
			testRuntimeException3();
		}catch(Exception e){
			System.out.println("03发生异常了");
		}
		
		testException1();
		testException2();
		testException3();
		
	}
	
	//JVM自动处理  RuntimeException
	public  static void testRuntimeException1(){
	//这里或产生 ArithmeticExcetion,他是RuntimeException的子类     可以不处理一样可以编译运行
	// 产生一样 会由JVM自动处理     1、 打印异常追踪栈中的信息到标准错误输出   2、立即停止程序运行
		int a= 100;  
		a = 100/0;			//java.lang.ArithmeticException: / by zero
		System.out.println(a);
	}
	
	// 手动处理  RuntimeException    用try...catch
	// 当try中的代码出现异常    try中那句以后的代码都将不执行了    直接跳到 与异常匹配的catch中去执行
	// 执行完catch代码块以后 继续往下执行  
	// 程序不会因为异常而停止
	public static void testRuntimeException2(){
		int a= 100;
		try{
		a = 100/0;	
		System.out.println("02没有出现异常");
		}catch(ArithmeticException e){
			System.out.println("02出现异常了");
		}
		System.out.println(a);
	}
	
	
	// 通过  throws  抛出异常  让调用者处理            当然对于RuntimeException  可以不处理    也可以通过编译
	// 当然代码该代码块中   发生异常代码后面的代码也不会被执行了
	//所以只有在遇到  不能解决的异常  才抛给调用者
	public static void testRuntimeException3() throws ArithmeticException {
		int a= 100;
		a = 100/0;	
		System.out.println(a);
	}
	
	// 产生   编译期的异常
	public static void testException1(){
		SimpleDateFormat  sf  = new SimpleDateFormat("yyy-MM-dd");
		try {
			sf.parse("hahah");     //这是必须处理的  不然无法编译
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
	// 自定义    异常对象 
	// java只提供了一些常用的  异常      但实际开发中我们的项目  业务逻辑上不允许一些现象出现   所以我们要自定义一些异常
	//比如   成绩不可以是  负数等
	//  自定义  编译期异常         继承 Exception      	重写无参 构造器   和有参构造器
	//  自定义 运行期异常          继承RuntimeException 	 重写  无参构造器   和  有参构造器
	public static void  testException2(){		
		int score =-3;
		if(score < 0){
			MyException  e  = new MyException("分数不能为负数"); //这里的参数最终传导Throwable的message参数
			try {
				throw  e;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else{
			score =0;
		}
	}
	
	
	//throw手动抛异常 
	//  throw   就是   手动的将     程序创建一个异常对象抛出
	// 对throw抛出的对象  处理有两种方式   一种  try..catch...    另外一种  throws
	
	//他就是和JVM在   某段代码    产生异常的时候            虚拟机  产生异常对象并抛出
	public static void  testException3(){		
		int a =0;
		if(a ==0){
			Exception  e  = new Exception("不可以为0");
			try {
				throw  e;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else{
			a = 2/a;
		}
	}
	
}

class  MyException  extends Exception{
	//重写无参构造器
	public MyException() {
		super();

	}
	//重写有参数构造器
	public MyException(String message) {
		super(message);
	}
	
}
