package com.itcast.find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFind {
	public static void main(String[] args){
		//Ҫ���ҳ�  ���� �ַ��ĵ���
		String s = "jin tian yao xia yu,suo yi wan shang bu shang wan zhi xi!!";
		Pattern  pattern  = Pattern.compile("\\b\\w{3}\\b");    //    \\b��ʾ���ʵı߽�
		Matcher  matcher  = pattern.matcher(s);
		while(matcher.find()){
		System.out.println(matcher.group());
		}
	}
}
