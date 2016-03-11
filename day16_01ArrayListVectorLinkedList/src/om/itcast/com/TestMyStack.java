package om.itcast.com;

import java.util.LinkedList;

//  ����   LinkedList    �� ʵ��ջ�Ĺ���           FILO
public class TestMyStack {
	public static void  main(String[] args){
		MyStack  stack   = new MyStack();
		stack.add("hello");
		stack.add("android");
		stack.add("java");
		while(!stack.isEmpty()){
			System.out.println((String)stack.get());
		}
	}
		
}
class  MyStack{
	LinkedList  list;
	public  MyStack(){
		list = new LinkedList();
	}
	public  void add(Object obj){
		list.addFirst(obj);
	}
	
	public Object  get(){
		//return list.getFirst();
		return  list.removeFirst();
	}
	
	public  boolean  isEmpty(){
		return list.isEmpty();
	}
}