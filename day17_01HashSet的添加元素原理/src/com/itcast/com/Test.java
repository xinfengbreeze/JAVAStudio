package com.itcast.com;

import java.util.HashSet;

//Set  ����û��ʲô���з���   ֻ�Ǽ̳���Collection�ķ���         Ԫ������(��ָ������Ԫ�ز�������ӵ�˳��)  ��  ���ɴ��ظ�Ԫ��
// Set  �������ص�  1������   2��Ԫ�ز����ظ�
//  ע�⣺���������     ��ָ  Ԫ�ر����˳���ǰ��� ��ӵ�˳��      �� ������ָԪ�ر����û��˳��
//  ���Set���� û�о����޸�  ��ǰ������ ������˳����һ����  ��˵��Ԫ�ر�����������
//  ���磺HashSet�ǰ�hasCode()��ֵ���� ����Ԫ�صģ� TreeSet�ǰ��ն��������б���Ԫ�صģ����Ƕ������򱣴�ġ�
//HashSet  
// �ǰ���hasCode()ֵ����Ԫ�صļ���

// ʲô��   ��ϣ��
// ��ϣ��   ��һ��Ԫ����   �����  ���飻    ÿ����ϣֵ����һ���ڵ�

// ��֤Ԫ�صĲ����ظ����� Ψһ�ԣ���ͨ��  ���ж� hasCode() ;���ж�equals()����   ����֤Ԫ�ص� Ψһ��
// �����ж�hashCode() ��ֵ�ڹ�ϣ�����Ƿ������
// ������                     ֱ�����Ԫ��    (���ñȽ�equals())
// ����     		  �ڱȽ�equals()����       �͵�ǰ��ϣֵ�ڵ��������е�Ԫ��ÿ�����Ƚ�һ��
			//�����Ծ�����֤ÿ����ϣ�ڵ��������ֻ����һ��ֵ,�Ա����Ч�ʣ�
// �ȽϵĹ�������һ������true     Ԫ���Ѿ�����  �����
// ȫ������false    		       Ԫ�ز�����   ���    Ԫ��    ����ǰ  ��ϣֵ�ڵ��   ������

// ����Ҫ��д  hashCode()��equals()����
//����Ҫ����һ������         ����ʵ�ʿ����ж���   ��eclipse�Զ�����
//����һ��   equals������������true��ʱ��   hasCode()��ֵһ��Ҫ��ͬ
//���� ��ͬ��Ԫ�ػ��Ǳ����ȥ��   ���ǲ�����   HasSet�Ĺ����


public class Test {
	public static void main(String[] args) {
			HashSet<person>  hs  = new HashSet<person>();
			hs.add(new person("����",33));
			hs.add(new person("����",44));
			hs.add(new person("����",55));
			hs.add(new person("����",66));
			hs.add(new person("����",44));
			hs.add(new person("����",55));
			hs.add(new person("����",66));
			hs.add(new person("����",11));
			for(person p :hs){
				System.out.println(p);
			}
			
			
	}
}
class  person {
	String name ;
	int age ;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	
	// ������û����д  hashCode������equals����  ��Ĭ���õ���   Object������������  �Ƚϵ��ǵ�ֵַ  �� �õ�ַ������Ĺ�ϣֵ
	//�����ж�  ����new�����Ķ����ǲ���ͬ��
	// ��������Ҫ��д����������   ��������        �ж���ͬ�ı�׼
	
	public int hashCode() {
		//return 3;
		//������ʹ   ����Ԫ��  ���浽    ��ϣֵ Ϊ3 �� �ڵ��µ�����    ��
		//�������� HashSet ���жϻ���          ��ϣֵһ��   ���ж� equals()
		//��ô ���Ὣ��ǰ����  ��   �ýڵ���  �����е�����Ԫ��  ���Ƚ�һ��
		//�����ͽ�����HashSet������
		//��Ȼ��������Ҫ���ǲ�������ô��
		
		
		//Ϊȷ������  ��Ȼ����ͬ     ������һ��ϵ��
		final int prime = 31;
		int result = 1;
		result = prime * result + age;   
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
	//�����������˼���   equals��������  ���鿴���� 
	//	System.out.println(this.toString() +"��"+((person)obj).toString());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}