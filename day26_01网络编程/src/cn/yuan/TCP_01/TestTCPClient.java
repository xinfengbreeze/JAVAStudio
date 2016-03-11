package cn.yuan.TCP_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/*
 * �ͻ���   ʹ��socket   ����ָ��  ���ʵ�������ַ�Ͷ˿�
 */
public class TestTCPClient {
	public static void main(String[] args) throws IOException {
		//Socket socket = new Socket(InetAddress address, int port);
		//Socket socket = new Socket(String host, int port);
		//�������ַ�ʽһ�� ����ָ��������ַ     �Ͷ˿�
		Socket  socket  = new Socket("127.0.0.255",20000);  //��������
		OutputStream   os  = socket.getOutputStream();  //��ȡ�������ͨ�������Ը�������д  д��������
		final InputStream is = socket.getInputStream();//��ȡ���������͹�����������
		
		BufferedReader  reader  = new BufferedReader(new InputStreamReader(System.in));
		//���̶�ȡ��     �����Ƕ�ȡ���̵� ����    ��������read�ķ�����������   ֻ���������رյ�ʱ����˳�
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
			os.write(buff.getBytes());  //д��������
			os.flush();
		}
		
		thread.stop();
		socket.close();
		
	}
}
