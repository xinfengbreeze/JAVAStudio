package com.itcast.find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFind {
	public static void main(String[] args){
		//要求找出  三个 字符的单词
		String s = "jin tian yao xia yu,suo yi wan shang bu shang wan zhi xi!!";
		Pattern  pattern  = Pattern.compile("\\b\\w{3}\\b");    //    \\b表示单词的边界
		Matcher  matcher  = pattern.matcher(s);
		while(matcher.find()){
		System.out.println(matcher.group());
		}
	}
}
