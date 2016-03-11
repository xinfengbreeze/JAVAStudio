package com.itcast.www;

public class testFind {
	public static void main(String[] args){
		int[] ar = new int[]{22,33,44,55,66,77,88};
		//二分法查找      注意 一定是有序 的         但是如果你要是先排序也改变了 数组的顺序   所以对于无序的 用基本查找
		int a = getIndex(66,ar);
		System.out.println(a);
		a = getIndex(8,ar);
		System.out.println(a);
	}
	public static int getIndex(int value , int[] array){
		int min =0;
		int max = array.length-1;
		int mid = (min +max)/2;
		
		while(array[mid] != value){	//不等于  就说明不是当前的中间值	
			if(array[mid]  < value){  // 向左边找
				min = mid +1;
			}else {                //向右边找
				max = mid -1;
			}
		//加入判断   min会变大  max  会变小     当min  >max的时候说明 已经找不到了
			if(min > max){
				return -1;
			}
			mid = (min + max)/2;
		}	
		return mid;
	}
}
