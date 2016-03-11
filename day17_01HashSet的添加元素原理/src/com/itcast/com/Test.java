package com.itcast.com;

import java.util.HashSet;

//Set  集合没有什么特有方法   只是继承了Collection的方法         元素无序(是指他保存元素不是已添加的顺序)  且  不可存重复元素
// Set  的两个特点  1、无序   2、元素不可重复
//  注意：这里的无序     是指  元素保存的顺序不是按照 添加的顺序      ， 而不是指元素保存的没有顺序
//  如果Set集合 没有经过修改  ，前后两次 迭代的顺序是一样的  ，说明元素保存的是有序的
//  例如：HashSet是按hasCode()的值进行 保存元素的， TreeSet是按照二叉树进行保存元素的，他们都是有序保存的。
//HashSet  
// 是按照hasCode()值保存元素的集合

// 什么是   哈希表
// 哈希表：   是一种元素是   链表的  数组；    每个哈希值代表一个节点

// 保证元素的不可重复（即 唯一性）是通过  先判断 hasCode() ;在判断equals()方法   来保证元素的 唯一性
// 首先判断hashCode() 的值在哈希表中是否存在了
// 不存在                     直接添加元素    (不用比较equals())
// 存在     		  在比较equals()方法       和当前哈希值节点中链表中的元素每个都比较一遍
			//（所以尽量保证每个哈希节点的链表中只保存一个值,以便提高效率）
// 比较的过程中有一个返回true     元素已经存在  不添加
// 全部返回false    		       元素不存在   添加    元素    到当前  哈希值节点的   链表中

// 所以要重写  hashCode()和equals()方法
//并且要按照一定规则         但是实际开发中都是   用eclipse自动生成
//还有一点   equals（）方法返回true的时候   hasCode()的值一定要相同
//否则 相同的元素还是被存进去了   这是不符合   HasSet的规则的


public class Test {
	public static void main(String[] args) {
			HashSet<person>  hs  = new HashSet<person>();
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
	//用来看进入了几次   equals（）方法  来查看性能 
	//	System.out.println(this.toString() +"和"+((person)obj).toString());
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