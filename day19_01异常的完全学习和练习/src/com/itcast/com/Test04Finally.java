package com.itcast.com;
// finally
// ������ԭ��   Ϊ�˱�֤��Դ��   �ͷ�     ������������Դ
// jvm�������������ͷ�   �ڴ��е����õĶ��� �������Զ��ͷ� һЩӲ����Դ    ������Ҫ�ֶ������ͷ�
// �������  �����г������쳣     �ͷ�Ӳ����Դ�Ĵ���Ͳ�һ����ִ�е���
//���Ա���   ��ִ֤�е���Щ�ͷ���Դ�Ĵ���
// 1�� try...catch...�еĴ��������Ƿ����쳣     finally...�еĴ��붼����ᱻִ�е�
// 2�� ���� ��ִ��finally���� ֮ǰ  System.exit(1)�ķ��� �ر��������
// 3�� ��ʹ try...catch....�ķ�������return   Ҳ����returnִ��ǰ  ȥ��ִ��    finally�еĴ���  Ȼ������ִ��return
// 4�� finally�о�����Ҫд    return��  trow  
public class Test04Finally {

	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt(){		
		int a =100;
		try{
			a  =a/0;
			System.out.println("tryִ������");
			return a ;		
		}catch(Exception e){
			System.out.println("catchִ������");
			//System.exit(1);
			return a;  // �������� return  �Ƚ�return a;��Ϊreturn 100;  
			//Ȼ��ȥִ��finally�еĴ���     a����Ϊ �� 200��    �������  �ڴ���a =200; ����return����100
		}finally{
			a=200;			
			System.out.println("finallyִ�е���");
		}
	}
}
