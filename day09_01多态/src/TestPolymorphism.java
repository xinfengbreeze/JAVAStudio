/*
 2:��̬(����)
	(1)ͬһ�������ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
	(2)��̬��ǰ�᣺
		A:�м̳л���ʵ�ֹ�ϵ��
		B:�з�����д��
		C:�и�����߸��ӿ�����ָ���������		
		��̬�ķ��ࣺ
			a:�������̬
				class Fu {}
				class Zi extends Fu {}			
				Fu f = new Zi();
			b:�������̬
				abstract class Fu {}
				class Zi extends Fu {}				
				Fu f = new Zi();
			c:�ӿڶ�̬
				interface Fu {}
				class Zi implements Fu {}				
				Fu f = new Zi();
	(3)��̬�еĳ�Ա�����ص�
		A:��Ա����
			���뿴��ߣ����п����
		B:���췽��
			����Ĺ��춼��Ĭ�Ϸ��ʸ��๹��
		C:��Ա����
			���뿴��ߣ����п��ұ�
		D:��̬����
			���뿴��ߣ����п����
			
		Ϊʲô?
			��Ϊ��Ա��������д��
	(4)��̬�ĺô���
		A:��ߴ����ά����(�̳�����)
		B:��ߴ������չ��(��̬����)
	(5)��̬�ı׶ˣ�
		������ʹ���ӵ����й��ܡ�
		
		����
			�ӿ��Ե�����ʹ�ã������ܵ�����ʹ�á�
	(6)��̬�е�ת��
		A:����ת��
			���ӵ���
		B:����ת��
			�Ӹ�����
	(7)����װ���İ��������������̬
	(8)��̬����ϰ
		A:è������
		B:��ʦ��ѧ������
 */
public class TestPolymorphism {
	public static void main(String[] args){
		Fu  f = new Zi();   // ��̬
		
		//��̬��  ��Ա�����ı���          ���뿴��� �������оͿ��Է��ʣ�û�оͲ����Է��ʱ��붼ͨ������
		//    ��Ա������ ����        ���ʿ����  �����ʵľ��Ǹ������������ֵ��
		System.out.println(f.age);   // ��Ա�����ķ���       �����  ��������Ǹ���
	//	System.out.println(f.name);  // �������ͳ�����
		
		//��̬��  ��Ա�����ı���          ���뿴��� �������оͿ��Է��ʣ�û�оͲ����Է��ʱ��붼ͨ������
		//    ��Ա������ ����        ���ʿ��ұ�  ����������з��ʵľ��Ƕ��ӵģ���û�оͷ��ʸ��׵ģ�		
		f.work();
		//f.play();// ��������е��Ǹ���û��  ���Ա���
		
		
		//��̬��  ��̬�����ı���          ���뿴��� �������оͿ��Է��ʣ�û�оͲ����Է��ʱ��붼ͨ������
		//     ��̬������ ����        ���ʿ���߱�  �����ʸ��׵ģ�	
		f.Sleep();
		
	}

}
class Fu{
	public int age =50;
	public void work(){
		System.out.println("������Ǯ");
	}
	public static void Sleep(){
		System.out.println("˯�����");
	}
}
class Zi extends Fu{
	public int age =18;
	public String  name  ="С��";
	public void work(){
		System.out.println("ѧϰ֪ʶ");
	}
	public  void  play(){
		System.out.println("����Ϸ");
	}
	public static void Sleep(){
		System.out.println("z z Z Z");
	}
}

/*
50
ѧϰ֪ʶ
˯�����
*/