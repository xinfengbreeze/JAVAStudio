package com.itcast.testobject;

public class Test {
//Object��������java���ֱ�ӻ��߼�ӵĸ���
//Object  ֻ���ṩ��һ����Ļ������
//���еĺܶ෽�����඼Ҫ������д  ���������  ��  hashCode()    toString()  equals()
//������������eclipse�п����Զ�����      ��Ϊ����Object���е�   �������е��඼��     ���Ҽ���������д��
//����eclipse �ͼ����˸ù���
	public static void main(String[] args) throws InterruptedException{
			Object  obj = new Object();
			
			//��øö���İ�����
			Class class1= obj.getClass();
			String name  = class1.getName();
			System.out.println(name);
			
			//���hashCode
			int hashCode = obj.hashCode();  //����ͨ��������ڴ��ַ  ��������� ������  �ڴ��ַ
			System.out.println("��ϣֵ:"+hashCode);
			System.out.println("ת��Ϊʮ�����ƣ�"+Integer.toHexString(hashCode));
			//toString����
			//���ֱ�Ӵ�ӡһ������     ��ӡ�����������  toString()����
			//���һ����û�и�д toString���� ��ô����Ĭ�ϵ�ֵ�����ĸ����toString����
			//Object���toString������ӡ��������        ������ @ʮ�����еĹ�ϣֵ
			String  s  = obj.toString();
			System.out.println(s);
			
			
			Student st3  = new Student("����",33);
			Student st4  = new Student("����",44);
			Student st5  = new Student("����",33);
			Student st6  = st3;
			
			System.out.println( st3.equals(st4));
			System.out.println( st3.equals(st5));
			System.out.println( st3.equals(st6));
			
			
			
			System.out.println(st3.toString());
		
			Thread.sleep(30000);
	}

}
