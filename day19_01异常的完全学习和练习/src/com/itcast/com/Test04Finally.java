package com.itcast.com;
// finally
// 产生的原因：   为了保证资源的   释放     尤其是物理资源
// jvm的垃圾回收是释放   内存中的无用的对象 ，不能自动释放 一些硬件资源    ，所以要手动进行释放
// 但是如果  程序中出现了异常     释放硬件资源的代码就不一定被执行到了
//所以必须   保证执行到这些释放资源的代码
// 1、 try...catch...中的代码无论是否发生异常     finally...中的代码都必须会被执行到
// 2、 除非 在执行finally方法 之前  System.exit(1)的方法 关闭了虚拟机
// 3、 即使 try...catch....的方法中有return   也会在return执行前  去先执行    finally中的代码  然后再在执行return
// 4、 finally中尽量不要写    return和  trow  
public class Test04Finally {

	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt(){		
		int a =100;
		try{
			a  =a/0;
			System.out.println("try执行完了");
			return a ;		
		}catch(Exception e){
			System.out.println("catch执行完了");
			//System.exit(1);
			return a;  // 这里遇到 return  先将return a;改为return 100;  
			//然后去执行finally中的代码     a被改为 了 200；    所以最后  内存中a =200; 但是return的是100
		}finally{
			a=200;			
			System.out.println("finally执行到了");
		}
	}
}
