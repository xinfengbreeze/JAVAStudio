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
			InetAddress inetAddress  = InetAddress.getByName(host);//���� ����  ������   ��������IP��ַ
			String name  = inetAddress.getHostName();   // ���������    �� ����������  ���˸��������
			String address = inetAddress.getHostAddress();//���������ַ   �� IP�ַ���
			System.out.println("������:"+name);
			System.out.println("������ַ��"+ address);
		}
}
/***  ���н��
������:www.baidu.com
������ַ��180.97.33.107
������:127.0.0.1
������ַ��127.0.0.1
������:breeze-PC
������ַ��192.168.0.105
 */
