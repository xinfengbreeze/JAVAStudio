package com.itcast.www;
// �ɱ����  Ҫ���յ�֪ʶ��
// 1���ɱ������  JDK1.5�Ժ���ֵ�
// 2�� ���Ա��������֮���������
// 3�� ��Ҫ�����ɲ�����ʱ��   ��  �ɱ�������������һ��
// 4��Ҳ ������    �ɱ����     ���� ����   
public class TestKeBianCanShu {
	public static void main(String[] args) {
		
		System.out.println(   sum(1,2,3,4)   );
		
		int[] arr  = new int[]{6,7,8,9};
		int sum  = sum(arr);         // ��ɱ����ֱ�Ӵ�������Ҳ����
		System.out.println(sum);
	}
	public static  int  sum(int... b){
		// �ɱ����   �������   ����
		//���Կ��Ե�������  		
		System.out.println(b[0]);  // ���Ե�������
				
		int sum = 0;
		for(int i : b){
			sum+=i;
		}
				
		return sum;
	}
	//���ж��������ʱ��      �ɱ��������λ�����
	public static String sum( String b, int... a){
		return b;
	}

}
//  �������ĵĴ���
/*
	public static transient int sum(int b[])
	{
		System.out.println(b[0]);
		int sum = 0;
		int ai[];
		int k = (ai = b).length;
		for (int j = 0; j < k; j++)
		{
			int i = ai[j];
			sum += i;
		}

		return sum;
	}

	public static transient String sum(String b, int a[])
	{
		return b;
	}
 */
