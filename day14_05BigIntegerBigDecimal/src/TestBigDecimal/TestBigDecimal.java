package TestBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimal {
	public static void  main(String[] args){
		//������ʧ�˾���
		System.out.println(0.09+0.01);
		System.out.println(1.0-0.32);
		System.out.println(1.015*100);
		System.out.println(1.301/100);
		//��  BigDecimal(new  String()) ������ �ſ���
		BigDecimal  bd1  =new BigDecimal("0.09");
		BigDecimal  bd2  =new BigDecimal("0.01");
		System.out.println(bd1.add(bd2));
		
		  bd1  =new BigDecimal("1.0");
		  bd2  =new BigDecimal("0.32");
			System.out.println(bd1.subtract(bd2));
		  bd1  =new BigDecimal("1.015");
		  bd2  =new BigDecimal("100");
			System.out.println(bd1.multiply(bd2));
		
		  bd1  =new BigDecimal("1.301");
		  bd2  =new BigDecimal("100");
			System.out.println( bd1.divide(bd2));
	}
}
