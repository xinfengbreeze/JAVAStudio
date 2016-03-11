package com.itcast.www;

public class TestSystem {
	public static void main(String[] args) throws Throwable{
		testGc();
		testIfo();
		testExit();
	}
	
	public static void testGc() throws Throwable{
		Person p  = new Person();
		p.setName("����");
		System.out.println(p.toString());
		p  = null;
		System.gc();
		//�Զ����������� ��  JVM����  ����� finalize()����  ���÷����ڲ�������super.finalize()��,�������������϶������
		//�ֶ����� gc()   ����jvm���������������     ���ǵ���finalize()
		//һ�㲻������ô��    ӦΪ��������Ҳ����ռcpu��Դ 
	}
	
	public static void testExit(){
		System.out.println(System.currentTimeMillis());// ����� 1970-1-1-0ʱ��ʱ���ֵ  ����Ϊ��λ
		System.out.println("hello");
		System.exit(0);   //�������۴����Ǽ� ��������ֹͣ�����    һ�㴫�����0  ��ʾ�����ر�     ������ʾ �쳣�ر�
		System.out.println("hello");
	}
	
	public static void testIfo(){
		System.out.println(System.getenv());
		System.out.println(System.getenv("JAVA_HOME"));
	}
}
  class  Person {
	  String name ;
	  //��д finalize��������
	  @Override
	protected void finalize() throws Throwable {
		System.out.println("���ն�����");
		super.finalize();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "person [name=" + name + "]";
	}
	  
  }