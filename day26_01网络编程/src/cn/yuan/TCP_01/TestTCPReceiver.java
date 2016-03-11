package cn.yuan.TCP_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTCPReceiver {
	public static void main(String[] args) throws IOException {
		ServerSocket  serverSocket  = new ServerSocket(20000);//指定本程序的端口
		Socket  socket = serverSocket.accept(); // 获取套接字  
		InputStream  is = socket.getInputStream();//获得  客户端  发送过来的流
		OutputStream  os = socket.getOutputStream();  //获得向客户端发送数据的流 通道

		byte[] receiverBuffer  = new byte[1024];
		int len ;
		while((len = is.read(receiverBuffer)) != -1){
			//这里的reader 是一个阻塞方法  他和IO流中read()内部原理不一样 哪里的read方法是不阻塞的    
			//这里的 是阻塞的   当  客户端关闭输出流时  才会读到结尾        他和读取键盘的流一样是阻塞的   除非你手动停止他
			System.out.println(new String(receiverBuffer,0,len));
			
			os.write("服务器收到了！".getBytes());
		}
		

		socket.close();
		
		
	}

}
