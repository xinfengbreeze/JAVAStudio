package TestBigInteger;

import java.math.BigInteger;

public class TestBigInteger {
	public static void main(String[] args){
		Integer  i = new Integer("1");
		System.out.println(i.MAX_VALUE);
		Integer  ii = new Integer("2147483647");
		System.out.println(ii);
		//Integer  iii = new Integer("2147483648");  //大于 int 最大值的 数就表示不了了
		//System.out.println(iii);
		
		BigInteger  iii = new BigInteger("2147483648");
		System.out.println(iii);
		
	}
}
