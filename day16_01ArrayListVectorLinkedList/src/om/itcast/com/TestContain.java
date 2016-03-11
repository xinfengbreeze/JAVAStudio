package om.itcast.com;

import java.util.ArrayList;

public class TestContain {
	public static  void  main(String[] args){
		ArrayList  list  = new ArrayList();
		list.add(new Student("张三",33));
		list.add(new Student("张三",33));
		list.add(new Student("张三",55));
		list.add(new Student("李四",44));
		list.add(new Student("王二",33));
		list.add(new Student("李四",44));
		
		//去除集合中相同的元素
		ArrayList newList  = new ArrayList();
		for(int i =0; i<list.size();i++){
			Student  stu = (Student)list.get(i);
			if(!(newList.contains(stu))){   //判断一下如果不包含就  添加元素到新集合中
				//这里必须注意的是    contains底层调用的是equals方法   如果对象没有重写该方法    调用的是Object的equals()方法
				//他比较的是    对象的地址值    所以   都不一样  
				//所以要实现  contains方法  必须重写equals（）方法
				newList.add(stu);
			}
		}
		
		for(int i =0; i<newList.size();i++){
			Student  stu = (Student)list.get(i);
			System.out.println(stu.toString());
		}
		
	}
	
}
class Student{
	String name ;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
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