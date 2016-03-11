package com.itcast.com;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
	public static  void main(String[] args){
		//testNewFile();
		//createFile();
		//testDelete();
		//testRenameTo();
	//	testExists();
	//	testGet();
	//	testList();
		testFilenameFileter();
	}

// 文件的构造方法
// File(String path);
// File(String parentPath ,String childPath);
// File(File parent , String childPath);
	public static void testNewFile(){
		File f1 = new File("d:/aaa/dd");
		File f2 = new File("d:\\aaa\\bbb", "a.text");
		File f3 = new File(f1,"b.txt");
	}
	
//创建  文件 
//public boolean createNewFile(); //文件不存在就创建  存在就不创建   ，如果路径的父路径不存在就报异常
//public boolean mkdir()   //文件夹  不存在就创建   存在就不创建 ，     ，如果路径的父路径不存在    也不会报异常但是不会创建
//public boolean mkdirs()  //创建多层文件夹   不存在就创建， 存在就不创建  ，如果父类路劲不存在也一起创建
	public static void createFile(){
		File f = new File("a.txt");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f1 = new File("a/b/a.txt");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2 = new File("aaa");
		System.out.println(f2.mkdir());
		
		File f3 = new File("a/b/c");
		System.out.println(f3.mkdir());
		
		File f4  = new File("aaa/bbb/ddd");
		System.out.println(f4.mkdirs());		
	}
	
//删除 文件
// public boolean delete()
//  java的删除不进回收站
// 注意当  删除的文件夹中包含  有子文件的时候是删除不了的，只能 一层一层的删除
	public static  void  testDelete(){
		File  f1  = new File("aaa");
		System.out.println(f1.delete());
		
		File f2 = new File("aaa/bbb");
		System.out.println(f2.delete());
	}
//	boolean  renameTo(File file);
//  如果修改的路劲相同    		就是 重命名
//  如果修改的路径不相同 		  就是  移动文件
	public static void  testRenameTo(){
		File f1 = new File("a.txt");
		File f2 = new File("abc.txt");
		File f3 = new File("aaa/bbb/abc.txt");
		f1.renameTo(f2);
		f2.renameTo(f3);
	}

/*
 * 判断功能:
 * public boolean exists():判断是否存在
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 */
	public static void  testExists(){
		File f1 = new File("aaa/bbb/abc.txt");
		
		System.out.println( f1.exists() );
		System.out.println( f1.isFile());
		System.out.println( f1.isDirectory() );
		System.out.println( f1.canRead() );
		System.out.println( f1.canWrite() );
		System.out.println( f1.isHidden() );
	}
	/*
	 * 获取功能：
	 * public String getAbsolutePath()：获取绝对路径
	 * public String getPath():获取相对路径
	 * public String getName():获取名称
	 * public long length():获取长度。字节数
	 * public long lastModified():获取最后一次的修改时间，毫秒值
	 */ 
	public  static void testGet(){
		File  f1 = new File("aaa/bbb/abc.txt");
		System.out.println( f1.getAbsolutePath()  );
		System.out.println( f1.getName() );
		System.out.println( f1.getPath() );
		System.out.println( f1.getParent() );
		System.out.println( f1.length() );
		long  time = f1.lastModified();
		Date  date = new Date(time);
		SimpleDateFormat  sf = new SimpleDateFormat("yyy-MM-dd  HH:mm:ss");
		String s = sf.format(date);
		System.out.println(s);
	}
	/*
	 * 获取功能：
	 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
	 * public String[] list(FilenameFilter  ff):获取指定目录下的满足文件名过滤器要求的文件或者文件夹的名称数组
	 * public File[] listFiles(FilenameFilter  ff):获取指定目录下的满足文件名过滤器要求的文件或者文件夹的File数组
	 */	
	public static void testList(){
		File  f1 = new File("d:/");
		String[] s  = f1.list();
		for(String ss : s){
			System.out.println(ss);
		}
		System.out.println("-----------------------------------------");
		File[]  fs  = f1.listFiles();
		for(int i=0; i<fs.length;i++){
			System.out.println(fs[i].getName());
		}
	}
	
	// 查找  e盘根目录下    以.txt结尾的文件
	//方法一   ：首先获得所以的文件名       然后用字符串的endsWith(".txt")方法来判断
	// 方法二  用  文件名称过滤器  FilenameFilter      
	public static void  testFilenameFileter(){
		File  f  = new File("d:");
		String[] s  = f.list(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile()  && name.endsWith(".txt");
			}

		}) ;
				
		for(String ss : s){
			System.out.println(ss);
		}
	}
	
}