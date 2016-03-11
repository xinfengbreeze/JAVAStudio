package cn.yuan.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/*
 * 1������һ��socket  
 * 2�������ݴ��    �����ݣ����ݳ��ȣ�Ŀ���ַ��Ŀ��˿ڣ�
 * 3��socket�������ݰ�
 * 4���ر���
 */
/**
 * ��ʵ����� ������  "�������UDPͨ�ŵ�����"  �ӱ��ص� �˿�20008����       ������ַ��127.0.0.1��30009�˿�
 * @author breeze
 */
public class TestUDPSend {
	public static void main(String[] args) throws IOException {
		//DatagramSocket  datagramSocket  = new DatagramSocket(int port);ָ�����ص�ǰ����˿�
		//DatagramSocket  datagramSocket  = new DatagramSocket();   
		//�������ָ��Ҳ���Բ�ָ��        ���ڷ���ʱ  �ʹӸö˿ڷ��ͳ�ȥ����       ���ڽ��վ���  ֻ�������緢���������ݲ�ָ��ö˿ڵ�����
		
		DatagramSocket  datagramSocket  = new DatagramSocket(20008);
		byte[] buff   = "�������UDPͨ�ŵ�����".getBytes();
		int len  = buff.length;
		InetAddress inetAddress  = InetAddress.getByName("127.0.0.1");
		DatagramPacket   datagramPacket  =  new DatagramPacket(buff, len, inetAddress, 30009);
		//����Ķ˿���ָҪ���͵���Ŀ���ַ�ϵ�   Ŀ��˿�
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
		
	}

}
