package com.itcast.www;

public class testFind {
	public static void main(String[] args){
		int[] ar = new int[]{22,33,44,55,66,77,88};
		//���ַ�����      ע�� һ�������� ��         ���������Ҫ��������Ҳ�ı��� �����˳��   ���Զ�������� �û�������
		int a = getIndex(66,ar);
		System.out.println(a);
		a = getIndex(8,ar);
		System.out.println(a);
	}
	public static int getIndex(int value , int[] array){
		int min =0;
		int max = array.length-1;
		int mid = (min +max)/2;
		
		while(array[mid] != value){	//������  ��˵�����ǵ�ǰ���м�ֵ	
			if(array[mid]  < value){  // �������
				min = mid +1;
			}else {                //���ұ���
				max = mid -1;
			}
		//�����ж�   min����  max  ���С     ��min  >max��ʱ��˵�� �Ѿ��Ҳ�����
			if(min > max){
				return -1;
			}
			mid = (min + max)/2;
		}	
		return mid;
	}
}
