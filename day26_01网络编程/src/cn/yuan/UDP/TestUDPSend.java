package cn.yuan.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/*
 * 1、创建一个socket  
 * 2、将数据打包    （数据，数据长度，目标地址，目标端口）
 * 3、socket发送数据包
 * 4、关闭流
 */
/**
 * 本实验就是 将数据  "你好我是UDP通信的数据"  从本地的 端口20008发往       主机地址是127.0.0.1的30009端口
 * @author breeze
 */
public class TestUDPSend {
	public static void main(String[] args) throws IOException {
		//DatagramSocket  datagramSocket  = new DatagramSocket(int port);指定本地当前程序端口
		//DatagramSocket  datagramSocket  = new DatagramSocket();   
		//这个可以指定也可以不指定        对于发送时  就从该端口发送出去数据       对于接收就是  只接收网络发过来的数据并指向该端口的数据
		
		DatagramSocket  datagramSocket  = new DatagramSocket(20008);
		byte[] buff   = "你好我是UDP通信的数据".getBytes();
		int len  = buff.length;
		InetAddress inetAddress  = InetAddress.getByName("127.0.0.1");
		DatagramPacket   datagramPacket  =  new DatagramPacket(buff, len, inetAddress, 30009);
		//这里的端口是指要发送到的目标地址上的   目标端口
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
		
	}

}
