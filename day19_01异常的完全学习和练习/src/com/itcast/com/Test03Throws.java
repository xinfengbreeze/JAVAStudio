package com.itcast.com;

import java.io.FileNotFoundException;
import java.io.IOException;

//  throws   
// 如果一个方法   是  重写的一个父类的方法   那么  他用throws抛出的异常不可以比     比父类的该方法  thows抛出的异常     更多更大
// 如果有异常用    try...catch...处理
public class Test03Throws {
	public  static  void  main(String[] args){
		
	}
	
	
}

class  A  {
	public void  add() {
		
	}
	public void  sub() throws  ArithmeticException{
		
	}
	public void  sum() throws  ArithmeticException, IOException{
		
	}
}

class B  extends  A{
	// 1、 被重写 的父类方法  没有抛出异常   这里的add()也不可以抛出异常  
	public void  add() throws  ArithmeticException {
		
	}
	// 2、子类不能    抛出比     被重写 的父类方法    抛出更大异常    
	public void  sub() throws  Exception{
		
	}
	// 3、子类不能    抛出比     被重写 的父类方法    抛出更多异常  
	public void  sum() throws IOException,FileNotFoundException{
		
	}
}
