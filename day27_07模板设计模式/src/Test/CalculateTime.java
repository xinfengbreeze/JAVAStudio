package Test;
// �������     ����һ�δ�������е�ʱ��
// ����������   �û�Ҫ����Щ�������� ������
// ������ �ӿ�ʼ��ʱ   ����ʱ  ����ʱ��

//���Ĳ���  �ѽ�ʵ�� �����Ĳ����û�ʵ��  
//������ṩ��һ��ģ��     ���������Ѿ�ʵ�֣��û��̳в�ʵ�ֲ��ַ����Ϳ�����
//��������ģ��
public abstract  class CalculateTime {

	public abstract void code();
	
	public long  getTime(){
		long beginTime =  System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-beginTime+"����");
		return endTime-beginTime;
		
	}
	
}
