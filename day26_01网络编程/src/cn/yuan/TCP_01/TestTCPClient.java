package cn.yuan.TCP_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 客户端   使用socket   并且指明  访问的主机地址和端口
 */
public class TestTCPClient {
	public static void main(String[] args) throws IOException {
		//Socket socket = new Socket(InetAddress address, int port);
		//Socket socket = new Socket(String host, int port);
		//以上两种方式一样 都是指明主机地址     和端口
		Socket  socket  = new Socket("127.0.0.255",20000);  //建立连接
		OutputStream   os  = socket.getOutputStream();  //获取输出流，通过它可以给服务器写  写发送数据
		final InputStream is = socket.getInputStream();//获取服务器发送过来的数据流
		
		BufferedReader  reader  = new BufferedReader(new InputStreamReader(System.in));
		//键盘读取流     该流是读取键盘的 输入    并且它的read的方法是阻塞的   只有它的流关闭的时候才退出
		String buff ;
		
		Thread thread = new Thread(){
			public void run() {
					byte[]  recevierBuffer  = new byte[1024];
					int len ;
					try {
						while((len = is.read(recevierBuffer)) !=-1){
							System.out.println(new String(recevierBuffer,0,len));
						}
					} catch (IOException e) {
						e.printStackTrace();
					}	
			};
		};
		thread.start();

		
		
		
		
		while( (buff = reader.readLine()) !=null ){
			if(buff.equals("886")){
				break;
			}
			os.write(buff.getBytes());  //写给服务器
			os.flush();
		}
		
		thread.stop();
		socket.close();
		
	}
}
