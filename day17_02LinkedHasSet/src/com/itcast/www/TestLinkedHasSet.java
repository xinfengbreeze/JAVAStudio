package com.itcast.www;

import java.util.LinkedHashSet;

//LinkedHashSet    使用两种结构    1、一哈希表存储   2、以链表管理
// 这样 就可以  实现     有序了   ， 元素迭代的时候按照添加是顺序   取出
//但是 他的方法没有增多    还是和Set集合一样
//没有像List按索引查找的功能
public class TestLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<person>  hs  = new LinkedHashSet<person>();
		hs.add(new person("张三",33));
		hs.add(new person("李四",44));
		hs.add(new person("王五",55));
		hs.add(new person("赵六",66));
		hs.add(new person("李四",44));
		hs.add(new person("王五",55));
		hs.add(new person("赵六",66));
		hs.add(new person("张三",11));
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

	
	// 当我们没有重写  hashCode（）和equals（）  它默认用的是   Object的这两个方法  比较的是地址值  和 用地址算出来的哈希值
	//所以判断  所有new出来的对象都是不相同的
	// 所以我们要重写这两个方法   告诉他们        判断相同的标准
	
	public int hashCode() {
		//return 3;
		//这样会使   所有元素  保存到    哈希值 为3 的 节点下的链表    ，
		//这样根据 HashSet 的判断机制          哈希值一样   在判断 equals()
		//那么 它会将当前对象  和   该节点下  链表中的所有元素  都比较一边
		//这样就降低了HashSet的性能
		//虽然可以满足要求但是不建议这么做
		
		
		//为确保出现  而然的相同     还乘以一个系数
		final int prime = 31;
		int result = 1;
		result = prime * result + age;   
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		//System.out.println(this.toString() +"和"+((person)obj).toString());
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
