package om.itcast.com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestArrayListVectorLinkedList {
//List ����������
// ArrayList   �ײ�������ԭ��        �̲߳���ȫ   Ч�ʸ�        ���ҿ�     ��ɾ��
// Vector      �ײ�������ԭ��      �̰߳�ȫ    Ч�ʵ�         
// LinkedList  �ײ�������ԭ��    �̲߳���ȫ   Ч�ʸ�      ������   ��ɾ��
	public static void main(String[] args) {
		testArrayList();
		testVector();
		testLinkedList();

	}
//  ArrayListû��ʲô���з���   �� List�ķ���һ��
	public static void  testArrayList(){
		//����  �����ķ���    һ��  ������     ����һ����   ��ͨforѭ��
		ArrayList al  = new ArrayList();
		al.add("hello");
		al.add("world");
		al.add("java");
		//����������
		Iterator it  = al.iterator();
		while(it.hasNext()){
			 System.out.println((String)it.next());
		}
		//��ͨforѭ������
		for(int i =0 ; i<al.size(); i++){
			System.out.println((String)al.get(i));
		}
		}
	// vector   ��ʵ�ʿ����к����õ���   ����  �������ֵ�ʱ��Ҫ֪��      ��ʲô
	// �����ֵıȽ���       ��һЩ���з���  ���Ƕ������ڵ�  add()  get()   iterator()�������
	public static void  testVector(){
		Vector  v  = new Vector();
		v.add("hello");
		v.addElement("java");
		v.add(2,"world");
		
		String s = (String)v.elementAt(1);  // �൱��get(index)
		System.out.println(s);
			   s = (String)v.get(1);  
		System.out.println(s);
		
		Enumeration  enu  = v.elements();    // ö��     �൱������ĵ�����     ����֪���Ϳ�����
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
	//  LinkedList�����з���   addFirst()  addLast()    getFirst()  getLast() removeFirst() removeLast()
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
