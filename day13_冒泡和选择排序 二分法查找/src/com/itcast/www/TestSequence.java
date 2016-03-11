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

// 冒泡法  排序 原理 :  相邻两两比较   大的往后放   第一次比较完成      最大的放在最后面       这里的  “泡”就是指 的  最大那个
// 第二次比较  最后一个元素不用比了应为第一次比较 已经 得到他是最大的了
	public static  void  testMaoPao(int[] array){	
		for(int y =0; y < array.length-1 ;y++){  // 每一次的循环比较
			
			for(int i=0; i<array.length-1 -y ; i++){ //-1 是防止 指针越界    -y是为了优化每次少比较	
				if( array[i] > array[i+1]){   //两两比较     大的往后方
					int temp = array[i +1] ;
					array[i+1] = array[i];
					array[i]  = temp; 
				}
			}
		}	
	}
	
//选择排序的原理  ：  第一个和后面的 依次比较 小的选择出来   ，第一次比较完成     最小的在数组的最前面      选择  是指 选择出最小的
	public  static void  testChoice(int[] array){
		for(int x =0; x<array.length-1;x++){    //这里-1  表示  最后一个数的时候不用比较了
			for(int i =x; i<array.length; i++){   //每次比较 选出最小的值
				if(array[x] > array[i]){
					int temp = array[i];
					array[i] =array[x];
					array[x] = temp;
				}
			}
		}
	}
}