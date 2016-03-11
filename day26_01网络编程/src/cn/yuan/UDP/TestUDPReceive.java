package cn.yuan.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TestUDPReceive {
public static void main(String[] args) throws IOException {
	DatagramSocket  socket   = new DatagramSocket(30009);
	byte[] buff  = new byte[1024];
	int len =1024;
	DatagramPacket packet   = new DatagramPacket(buff, len);
	socket.receive(packet);
	
	InetAddress  address  = packet.getAddress();
	String  hostName  = address.getHostName();
	String  hostIP  = address.getHostAddress();
	int port  = packet.getPort();
	System.out.println("��������"+hostName+"--����IP:"+hostIP+"---�˿ںţ�"+port);
	
	byte[] buff2 = packet.getData();
	int len2  = packet.getLength();
	String data  = new String(buff2,0,len2);
	System.out.println("����������"+len2+"�ֽڣ���������"+data);
	
	socket.close();
	
}
}
