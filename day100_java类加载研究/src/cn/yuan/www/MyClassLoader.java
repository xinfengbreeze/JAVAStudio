package cn.yuan.www;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import sun.applet.AppletClassLoader;


public class MyClassLoader  extends ClassLoader {
	
	protected Class findClass(String name) throws ClassNotFoundException {
		System.out.println("MyClassLoader ��ʼ������"+ name + ".class");
		Class clazz =null ;
		byte[] buff = new byte[1024 *1014];
		FileInputStream  fis  = null ;
		try {
			fis = new FileInputStream("e:/"+name+".class");
			int len = fis.read(buff);
		 clazz = defineClass( buff, 0, len);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return clazz;
	}
	 public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
