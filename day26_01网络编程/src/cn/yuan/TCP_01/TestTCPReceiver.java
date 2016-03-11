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
		ServerSocket  serverSocket  = new ServerSocket(20000);//ָ��������Ķ˿�
		Socket  socket = serverSocket.accept(); // ��ȡ�׽���  
		InputStream  is = socket.getInputStream();//���  �ͻ���  ���͹�������
		OutputStream  os = socket.getOutputStream();  //�����ͻ��˷������ݵ��� ͨ��

		byte[] receiverBuffer  = new byte[1024];
		int len ;
		while((len = is.read(receiverBuffer)) != -1){
			//�����reader ��һ����������  ����IO����read()�ڲ�ԭ��һ�� �����read�����ǲ�������    
			//����� ��������   ��  �ͻ��˹ر������ʱ  �Ż������β        ���Ͷ�ȡ���̵���һ����������   �������ֶ�ֹͣ��
			System.out.println(new String(receiverBuffer,0,len));
			
			os.write("�������յ��ˣ�".getBytes());
		}
		

		socket.close();
		
		
	}

}
