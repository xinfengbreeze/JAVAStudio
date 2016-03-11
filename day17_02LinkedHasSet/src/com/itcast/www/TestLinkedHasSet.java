package com.itcast.www;

import java.util.LinkedHashSet;

//LinkedHashSet    ʹ�����ֽṹ    1��һ��ϣ���洢   2������������
// ���� �Ϳ���  ʵ��     ������   �� Ԫ�ص�����ʱ����������˳��   ȡ��
//���� ���ķ���û������    ���Ǻ�Set����һ��
//û����List���������ҵĹ���
public class TestLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<person>  hs  = new LinkedHashSet<person>();
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
		//System.out.println(this.toString() +"��"+((person)obj).toString());
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