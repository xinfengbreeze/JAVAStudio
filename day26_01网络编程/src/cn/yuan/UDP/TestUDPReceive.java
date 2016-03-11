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
	System.out.println("主机名："+hostName+"--主机IP:"+hostIP+"---端口号："+port);
	
	byte[] buff2 = packet.getData();
	int len2  = packet.getLength();
	String data  = new String(buff2,0,len2);
	System.out.println("数据内容是"+len2+"字节：：：：："+data);
	
	socket.close();
	
}
}
