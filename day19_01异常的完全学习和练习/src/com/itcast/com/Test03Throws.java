package com.itcast.com;

import java.io.FileNotFoundException;
import java.io.IOException;

//  throws   
// ���һ������   ��  ��д��һ������ķ���   ��ô  ����throws�׳����쳣�����Ա�     �ȸ���ĸ÷���  thows�׳����쳣     �������
// ������쳣��    try...catch...����
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
	// 1�� ����д �ĸ��෽��  û���׳��쳣   �����add()Ҳ�������׳��쳣  
	public void  add() throws  ArithmeticException {
		
	}
	// 2�����಻��    �׳���     ����д �ĸ��෽��    �׳������쳣    
	public void  sub() throws  Exception{
		
	}
	// 3�����಻��    �׳���     ����д �ĸ��෽��    �׳������쳣  
	public void  sum() throws IOException,FileNotFoundException{
		
	}
}
