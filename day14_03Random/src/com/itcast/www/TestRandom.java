package com.itcast.www;

import java.util.Random;

public class TestRandom {
	public  static  void main(String[] args){
	//Random  ���Բ����ܶ�����������͵�   α�����    �����Դ�������   ������� �����������һ������ô ���ε� ������α�����Ҳ��һ����
		//Random  rd  = new  Random();  //Ĭ�ϵ�������   System.currentTimeMillis();
		Random  rd  = new  Random(50);
		System.out.println(rd.nextInt(5));;
		System.out.println(rd.nextFloat());  //0--1.0
		System.out.println(rd.nextBoolean());
		
		
		Random  rd1  = new  Random(50);
		System.out.println(rd1.nextInt(5));;
		System.out.println(rd1.nextFloat());  //0--1.0
		System.out.println(rd1.nextBoolean());
		
	}
}
