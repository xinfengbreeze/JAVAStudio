package om.itcast.com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestArrayListVectorLinkedList {
//List 的三个子类
// ArrayList   底层是数组原理        线程不安全   效率高        查找快     增删慢
// Vector      底层是数组原理      线程安全    效率低         
// LinkedList  底层是链表原理    线程不安全   效率高      查找慢   增删快
	public static void main(String[] args) {
		testArrayList();
		testVector();
		testLinkedList();

	}
//  ArrayList没有什么特有方法   和 List的方法一样
	public static void  testArrayList(){
		//两种  遍历的方法    一种  迭代器     另外一种是   普通for循环
		ArrayList al  = new ArrayList();
		al.add("hello");
		al.add("world");
		al.add("java");
		//迭代器遍历
		Iterator it  = al.iterator();
		while(it.hasNext()){
			 System.out.println((String)it.next());
		}
		//普通for循环遍历
		for(int i =0 ; i<al.size(); i++){
			System.out.println((String)al.get(i));
		}
		}
	// vector   在实际开发中很少用到了   但是  当他出现的时候要知道      是什么
	// 他出现的比较早       有一些特有方法  但是都被现在的  add()  get()   iterator()方法替代
	public static void  testVector(){
		Vector  v  = new Vector();
		v.add("hello");
		v.addElement("java");
		v.add(2,"world");
		
		String s = (String)v.elementAt(1);  // 相当于get(index)
		System.out.println(s);
			   s = (String)v.get(1);  
		System.out.println(s);
		
		Enumeration  enu  = v.elements();    // 枚举     相当于下面的迭代器     我们知道就可以了
		while(enu.hasMoreElements()){
			s=(String)enu.nextElement();
			 System.out.println(s);
			
		}		
		Iterator  it  = v.iterator();
		while(it.hasNext()){
			s =(String)it.next();
			 System.out.println(s);
		}
	}
	//  LinkedList的特有方法   addFirst()  addLast()    getFirst()  getLast() removeFirst() removeLast()
	public  static  void testLinkedList(){
		LinkedList  list  =new LinkedList();
		list.add("hello");
		list.addFirst("java");
		list.addLast("world");
		
		System.out.println((String)list.getFirst());
		System.out.println((String)list.getLast());
		System.out.println((String)list.removeFirst());
		System.out.println((String)list.removeLast());
		System.out.println(list.size());
	}
}
