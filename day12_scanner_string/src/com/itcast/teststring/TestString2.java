package com.itcast.teststring;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class TestString2 {
	 public static void main(String[] args) throws UnsupportedEncodingException{
		 String s  = "helloworld";
		 System.out.println(s.length());
		 System.out.println(s.charAt(4));
		 System.out.println(s.indexOf('o'));
		 System.out.println(s.indexOf('o',5));
		 System.out.println(s.indexOf("rl"));
		 System.out.println(s.lastIndexOf('l'));
		 System.out.println(s.substring(8));
		 System.out.println(s.substring(3,8));
		 
		 for(int i =0;i<s.length();i++){
			 System.out.print	(s.charAt(i));
		 }
		 
		 s=s.toUpperCase();
		 byte[] b = s.getBytes("iso-8859-1");
		 System.out.println(new String(b,"iso-8859-1"));
		 s= s.toLowerCase();
		 char[] c =s.toCharArray();
		 System.out.println(c);
		 
		 
		 Scanner ss = new Scanner(System.in);
		 String ss1 = ss.nextLine();
		 String ss2  = ss1.substring(0,1);
		 String ss3 = ss1.substring(1);
		 ss1= ss2.toUpperCase().concat(  ss3.toLowerCase()   );
		 System.out.println( ss1);
				 
	 }
	 

	 
	 
	 
}
