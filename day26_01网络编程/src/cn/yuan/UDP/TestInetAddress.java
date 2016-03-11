package cn.yuan.UDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
		public  static void main(String[] args) throws UnknownHostException{
			testInetAddress("www.baidu.com");
			testInetAddress("127.0.0.1");
			testInetAddress("192.168.0.105");
		}
		
		public static void testInetAddress(String host) throws UnknownHostException{
			InetAddress inetAddress  = InetAddress.getByName(host);//可以 传入  主机名   或者主机IP地址
			String name  = inetAddress.getHostName();   // 获得主机名    即 主机的名字  是人给起的名字
			String address = inetAddress.getHostAddress();//获得主机地址   即 IP字符串
			System.out.println("主机名:"+name);
			System.out.println("主机地址："+ address);
		}
}
/***  运行结果
主机名:www.baidu.com
主机地址：180.97.33.107
主机名:127.0.0.1
主机地址：127.0.0.1
主机名:breeze-PC
主机地址：192.168.0.105
 */
