package com.itcast.www;

import java.util.ArrayList;
import java.util.Collection;

//����Ҫ���յļ���  ֪ʶ��  
// 1��ΪʲôҪ��������
// 2�����͵ĺô�
//3�����ͺ���    ���ͷ���   ���ͽӿ�        ����ͨ���
//?
// ��extends E
// �� super  E
public class TestTongPeiFu {

	public static void main(String[] args) {
		//Collection<Animal>  c1= new ArrayList<Dog>();  //���͵Ĺ���   ǰ��Ҫһ�·��� ����
		Collection<Animal>  c1= new ArrayList<>();  //���治д���� 1.7jdk ʵ�����Զ�ƥ���ǰ���һ��
		//Collection<>  c1= new ArrayList<Dog>();  //����ǰ�治д������
		Collection<?>  c2= new ArrayList<Dog>();  //  ����ͨ����Ժ�Ϳ��Բ�д   ���ͺ����һ��
		Collection<Animal>  c= new ArrayList<Animal>();
		
		Collection<? extends Animal>  c3= new ArrayList<Animal>();  //�����޶�    E��������   ����E��E������     
		Collection<? extends Animal>  c0= new ArrayList<Dog>();  //�����޶�   E��������   ����E��E������
		Collection<? extends Animal>  c4= new ArrayList<Cat>();
		//Collection<? extends Animal>  c5= new ArrayList<Object>();  ����Ͳ�������
		
		Collection<? super Animal>  c6= new ArrayList<Object>();   //�����޶�  E�������� E��E�ĸ���
		Collection<? super Animal>  c9= new ArrayList<Animal>();   //�����޶�   E�������� E��E�ĸ���
		//Collection<? super Animal>  c7= new ArrayList<Cat>();
		//Collection<? super Animal>  c8= new ArrayList<Dog>();
	}

}
class  Animal {
	
}

class Dog  extends Animal{
	
}
class Cat extends Animal{
	
}