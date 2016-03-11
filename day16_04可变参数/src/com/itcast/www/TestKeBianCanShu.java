package com.itcast.www;
// 可变参数  要掌握的知识点
// 1、可变参数是  JDK1.5以后出现的
// 2、 可以变参数编译之后后是数组
// 3、 当要传入多可参数的时候   ，  可变参数必须是最后一个
// 4、也 可以向    可变参数     传入 数组   
public class TestKeBianCanShu {
	public static void main(String[] args) {
		
		System.out.println(   sum(1,2,3,4)   );
		
		int[] arr  = new int[]{6,7,8,9};
		int sum  = sum(arr);         // 想可变参数直接传入数组也可以
		System.out.println(sum);
	}
	public static  int  sum(int... b){
		// 可变参数   编译后是   数组
		//所以可以当成数组  		
		System.out.println(b[0]);  // 可以当数组用
				
		int sum = 0;
		for(int i : b){
			sum+=i;
		}
				
		return sum;
	}
	//当有多个参数的时候      可变参数必须位于最后
	public static String sum( String b, int... a){
		return b;
	}

}
//  编译过后的的代码
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
