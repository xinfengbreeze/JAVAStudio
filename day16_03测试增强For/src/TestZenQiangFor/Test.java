package TestZenQiangFor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
//  List���ϵı���   ������  ��ʽ   ��Ҫ��    
//	1����ͨ for    size()   ��get(int Index)  
//  2��������
//  3�� ��ǿ for
//  ���� Collection  ��    Set  ��Ҫ��Ԫ�� ��ת����    toArray()  Ȼ��������� ��������  �� get(index);
//  ��ǿfor�ĵײ���ǵ�����
	public static void main(String[] args) {
		ArrayList<String>   list   = new ArrayList<String>();		
		list.add("hello");
		list.add("java");		
		// ��ͨ��for ѭ��  
		for(int i =0;i<list.size(); i++){
			String s = list.get(i);
			System.out.println(s);
		}		
		//������
		Iterator<String>  it  = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}		
		//��ǿfor
		for(String s : list){
			System.out.println(s);
		}
		
		int[]  ar = new int[]{1,2,3,4,5,6};
		for(int i : ar){
			System.out.print(i);
		}
	}
}

/* ���� �� ���ϴ��뷢���������  Դ��       ���Կ��������������ʱ�����˺ܶ����
 * 1�����;�������  ��û����    ˵��  ������д������������   �� Ȼ�����������ǲ��÷���ʱ��ɵĹ���
 * 2��������while�͵�ѭ�� �����Ż�����forѭ��
 * 3�����ǵ���ǿforҲ��   �����   �õ�����������ʵ��  ��˵��    �Լ�������ǿfor��ô���ĵײ�ʵ���ǵ�����
 * for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s))
 * 4�� ������Ƕ�����  ����ǿfor   ��ô���� �ײ��ʹ�� ��ͨfor  ��ʵ��
*/
/*
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("java");
		for (int i = 0; i < list.size(); i++)
		{
			String s = (String)list.get(i);
			System.out.println(s);
		}

		String s;
		for (Iterator it = list.iterator(); it.hasNext(); System.out.println(s))
			s = (String)it.next();

		String s;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s))
			s = (String)iterator.next();

		int ar[] = {
			1, 2, 3, 4, 5, 6
		};
		int ai[];
		int k = (ai = ar).length;
		for (int j = 0; j < k; j++)
		{
			int i = ai[j];
			System.out.print(i);
		}

	}

 */


