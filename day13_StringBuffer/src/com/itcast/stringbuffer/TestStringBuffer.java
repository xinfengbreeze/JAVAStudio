package com.itcast.stringbuffer;




//为什么要有 StringBuffer
//就是 String  在对字符串进行   改变的时候   会产生很多无用的字符串            简而言之 耗时耗空间
//用StringBuffer  他的内部含有一个 长度可变的字符缓冲区  就是字符数组     
// 这样当改变字符串的内容的时候  就是操作这  字符缓冲区   就不会在  常量池中  产生很多 无用的字符串了
public class TestStringBuffer {
	public static void main(String[] args){
		//testConstructor();
		testAppend();
	}
	
	//测试构造方法
	public static void  testConstructor(){
		StringBuffer sb1  =new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);  //int capacity
		StringBuffer sb3 = new StringBuffer("hello");	// CharSequence
		StringBuffer sb4 = new StringBuffer(new StringBuilder("helloJava"));//CharSequence
		System.out.println("length:"+sb1.length() +"capacity:"+sb1.capacity());
		System.out.println("length:"+sb2.length() +"capacity:"+sb2.capacity());
		System.out.println("length:"+sb3.length() +"capacity:"+sb3.capacity());
		System.out.println("length:"+sb4.length() +"capacity:"+sb4.capacity());
	}
	public static void  testAppend(){
		//StringBuffer其实是内部  创建了缓冲区    append(Object  obj),  
		//当append后它只是改变了缓冲区  ，返回的还是本身
		StringBuffer sb1  =new StringBuffer();
		sb1.append("hello");					//追加
		sb1.append(new byte[]{97,65,});
		StringBuffer sb2= sb1.append(188);    
		sb1.append(3.33f);						
		sb1.insert(1, "AAA");					//插入
		System.out.println(sb1);
		System.out.println(sb2==sb1);   
		
		sb1.deleteCharAt(1);					//删除
		sb1.delete(1,3);
		sb1.delete(0, sb1.length());			//实现清空
		System.out.println(sb1);
		
		sb1.append("hello").append("java");
		
		sb1.replace(5,9,"world");     			//替换
		System.out.println(sb1);
		
		System.out.println(sb1.lastIndexOf("lo"));				//查
		
		sb1.reverse();
		System.out.println(sb1);				//翻转		
		
		String string = sb1.substring(2,8);		//截取
		System.out.println(string);
		
		
	}
}
