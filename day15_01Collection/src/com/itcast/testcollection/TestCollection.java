package com.itcast.testcollection;

import java.util.ArrayList;
import java.util.Collection;

/* 
* ����ͼ��ϵ�����?
* 		A:��������
* 			����ĳ��ȹ̶�
* 			���ϳ��ȿɱ�
* 		B:���ݲ�ͬ
* 			����洢����ͬһ�����͵�Ԫ��
* 			�����Ͽ��Դ洢��ͬ���͵�Ԫ��
* 		C:Ԫ�ص�������������	
* 			������Դ洢�����������ͣ�Ҳ���Դ洢������������
* 			����ֻ�ܴ洢��������
* 
* ��˵�������Ǵ洢���Ԫ�ģ������أ��洢���Ԫ������Ҳ���в�ͬ����ģ�����˵����Ҫ����Ԫ���в�������ͬ��Ԫ�أ�
* �ٱ���˵����Ҫ����Ԫ�ذ���ĳ�ֹ�������һ�¡���Բ�ͬ������Java���ṩ�˲�ͬ�ļ����࣬�����أ�Java���ṩ�˺ܶ�������ࡣ
* ��������������ݽṹ��ͬ,�ṹ��ͬ����Ҫ�ģ���Ҫ������Ҫ�ܹ��洢���������һ�Ҫ�ܹ�ʹ����Щ����������˵�жϣ���ȡ�ȡ�
* ��Ȼ��������ô���������������й��Ե����ݵģ����ǰ���Щ������Ĺ������ݲ��ϵ�������ȡ�����վ����γɼ��ϵļ̳���ϵ�ṹ��
* 
* ���ݽṹ�����ݵĴ洢��ʽ��
* 
* Collection:�Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������ġ�(����������Ľ���)
* 
* Collection�Ĺ��ܸ�����
* 1����ӹ���
* 		boolean add(Object obj):���һ��Ԫ��
* 		boolean addAll(Collection c):���һ�����ϵ�Ԫ��
* 2:ɾ������
* 		void clear():�Ƴ�����Ԫ��
* 		boolean remove(Object o):�Ƴ�һ��Ԫ��
* 		boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
* 3:�жϹ���
* 		boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
* 		boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
* 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
* 4:��ȡ����
* 		Iterator<E> iterator()(�ص�)
* 5:���ȹ���
* 		int size():Ԫ�صĸ���
* 		�����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
* 6:��������
* 		boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
* 7���Ѽ���ת��Ϊ����
* 		Object[] toArray()
*/
public class TestCollection {
		public static void  main(String[] args){
			test1();
		}
		public static void test1(){
			//Collection ��һ���ӿ��� ����ֱ�� ���� List  Set..Ҳ��  �ӿ�
			//Collection  ���� ����ӿڵ�ʵ����
			//��ס����˼��
			//���
			Collection   col1  =new ArrayList();  
			col1.add("hello");
			col1.add("java");
			col1.add("world");
			System.out.println(col1.toString());
			Collection  col2  =new ArrayList();
			col2.addAll(col1);
			System.out.println(col2.toString());
			
			//�ж�
			System.out.println(col2.isEmpty());
			System.out.println(col2.contains("java"));
			System.out.println(col2.containsAll(col1));
			//����
			System.out.println(col1.size());
			
			//ɾ�� 
			col1.remove("java");
			System.out.println(col1.toString());
			col2.retainAll(col1);
			System.out.println(col2.toString());
			col1.removeAll(col2);
			System.out.println(col1.toString());
			col2.clear();
			System.out.println(col2.toString());
		}
}
