package com.itcast.replace;

public class TestReplace {
		public static void main(String[] args){
			String s  ="nihao wo d yingkahao 3243434daqian 2233 haoma ";
			String ss = "*";
			 s = s.replaceAll("\\d",ss);
			System.out.println(s);
		}
}
