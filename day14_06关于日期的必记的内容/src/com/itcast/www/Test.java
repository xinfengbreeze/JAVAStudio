package com.itcast.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	
//   总结   ：  如果只是 显示 时间  用Date类就可以了         如果要获取操作  日期中的 字段  这需要用 Calendar类   
//格式化输出日期 用SimpleDateFormat类    用format()格式化    用 parse()解析   一定格式的字符串  获得Date
//SimpleDateFormat的格式是程序员自己定义  非常灵活
	
	public static void main(String[] args) throws ParseException {
		testDate();
		testSimpleDateFormat();
		testCalender();

	}

	public static void testDate(){
		//日期类 要记住的方法就是  两个构造方法     和 getTime()  和 setTime()方法
		Date d  =new Date();  // 不传入参数就是获得系统单签的时间
		//Sun Oct 11 15:17:07 CST 2015
		Date d1 = new Date(100000);   //就是1970-1-1-0    加上这里的毫秒数
		System.out.println(d);
		System.out.println(d1);
		
		d1.setTime(20000);
		System.out.println(  d1.getTime());
	}
	
	// 虽然 Date打印的时候可以打印得出     Sun Oct 11 15:17:07 CST 2015
	//但是还是不好看 所以  用SimpleDateFormat    //他是一个 简单功能强大的  时间格式输出类
	public static  void testSimpleDateFormat() throws ParseException{
		//在实际开发中    主要是   Date------>String       String------>Date
		//这些  SimpleDateFormat可以做到   format()格式化      parse()解析    
		
		Date  d = new Date();
		// y表示年 M表示 月  d 日   D表示 一年中的第几天    E表示星期  H表示时  m表示分  s表示秒
		SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd-D-E-H:m:s");
		String s = sf.format(d);
		System.out.println(s);
		
		//parse()解析    一定格式的字符串    为Date
		SimpleDateFormat sf1 = new SimpleDateFormat("yy-MM-dd-H:m:s");
		Date d1  = sf1.parse("18-11-3-3:28:15");   //按照自定义的格式  解析字符串
		System.out.println(sf1.format(d1));
		
	}
	
	//Date类的方法太少了   为了可以 更多的操作日期    包括 日期的  加减   就要用到  Calendar类
	//Calendar 可以操作 年月日。。。。的每一个字段
	//getCalendar()    获得 Calendar对象
	//get(...)  getTime()
	//set(..)   set(..,...) set(...,....,...)
	//add(...,...)    roll(...,...)
	public static void testCalender(){
		//注意 这里的Calendar  对象不是new出来的
		//应为他的    对象 和 系统和语言 和时区有关  所以  不让  程序员自己new
		Calendar cal =  Calendar.getInstance();   //获得当前的时间
		System.out.println(cal.get(Calendar.YEAR));    //get(...)获得某个字段的值
		System.out.println(cal.get(Calendar.AM_PM));
		
		System.out.println(cal.get(Calendar.MONTH));   //这里的月要加1  应为计算机计算是时候从0开始的
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//这里的星期日  是  1   西方星期日是一周的第一天
		
		System.out.println(cal.get(Calendar.MONTH));
		cal.set(Calendar.MONTH, 3);   //可以设置一个字段    
		//cal.set( 2013,8,8);   		//也可以 设置多个字段
		System.out.println(cal.get(Calendar.MONTH));
		
		System.out.println(cal.get(Calendar.YEAR) +"年"+(cal.get(Calendar.MONTH)+1)+"月");
		cal.add(Calendar.MONTH, 15);  //在当前的时间上加15个月      add()他会进位一年   而 roll()方法 不带进位
		cal.roll(Calendar.MONTH, 15);
		System.out.println(cal.get(Calendar.YEAR) +"年"+(cal.get(Calendar.MONTH)+1)+"月");	
	
	}

}
