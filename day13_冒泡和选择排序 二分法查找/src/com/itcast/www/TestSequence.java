package com.itcast.www;

public class TestSequence {
public static void main(String[] args){
	int[] ar = new int[]{45,66,22,5,67,17,60}; 
	testMaoPao(ar);
	print(ar);
	System.out.println("");
	int[] ar2 = new int[]{88,66,2,5,44,17,10}; 
	testChoice(ar2);
	print(ar2);
}	
public static void print(int[] array){
	for(int i=0 ; i<array.length  ; i++){
		System.out.print(array[i] +", ");
	}
}	

// ð�ݷ�  ���� ԭ�� :  ���������Ƚ�   ��������   ��һ�αȽ����      ���ķ��������       �����  ���ݡ�����ָ ��  ����Ǹ�
// �ڶ��αȽ�  ���һ��Ԫ�ز��ñ���ӦΪ��һ�αȽ� �Ѿ� �õ�����������
	public static  void  testMaoPao(int[] array){	
		for(int y =0; y < array.length-1 ;y++){  // ÿһ�ε�ѭ���Ƚ�
			
			for(int i=0; i<array.length-1 -y ; i++){ //-1 �Ƿ�ֹ ָ��Խ��    -y��Ϊ���Ż�ÿ���ٱȽ�	
				if( array[i] > array[i+1]){   //�����Ƚ�     �������
					int temp = array[i +1] ;
					array[i+1] = array[i];
					array[i]  = temp; 
				}
			}
		}	
	}
	
//ѡ�������ԭ��  ��  ��һ���ͺ���� ���αȽ� С��ѡ�����   ����һ�αȽ����     ��С�����������ǰ��      ѡ��  ��ָ ѡ�����С��
	public  static void  testChoice(int[] array){
		for(int x =0; x<array.length-1;x++){    //����-1  ��ʾ  ���һ������ʱ���ñȽ���
			for(int i =x; i<array.length; i++){   //ÿ�αȽ� ѡ����С��ֵ
				if(array[x] > array[i]){
					int temp = array[i];
					array[i] =array[x];
					array[x] = temp;
				}
			}
		}
	}
}