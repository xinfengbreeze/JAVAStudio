/*
 2:多态(掌握)
	(1)同一个对象在不同时刻体现出来的不同状态。
	(2)多态的前提：
		A:有继承或者实现关系。
		B:有方法重写。
		C:有父类或者父接口引用指向子类对象。		
		多态的分类：
			a:具体类多态
				class Fu {}
				class Zi extends Fu {}			
				Fu f = new Zi();
			b:抽象类多态
				abstract class Fu {}
				class Zi extends Fu {}				
				Fu f = new Zi();
			c:接口多态
				interface Fu {}
				class Zi implements Fu {}				
				Fu f = new Zi();
	(3)多态中的成员访问特点
		A:成员变量
			编译看左边，运行看左边
		B:构造方法
			子类的构造都会默认访问父类构造
		C:成员方法
			编译看左边，运行看右边
		D:静态方法
			编译看左边，运行看左边
			
		为什么?
			因为成员方法有重写。
	(4)多态的好处：
		A:提高代码的维护性(继承体现)
		B:提高代码的扩展性(多态体现)
	(5)多态的弊端：
		父不能使用子的特有功能。
		
		现象：
			子可以当作父使用，父不能当作子使用。
	(6)多态中的转型
		A:向上转型
			从子到父
		B:向下转型
			从父到子
	(7)孔子装爹的案例帮助大家理解多态
	(8)多态的练习
		A:猫狗案例
		B:老师和学生案例
 */
public class TestPolymorphism {
	public static void main(String[] args){
		Fu  f = new Zi();   // 多态
		
		//多态中  成员变量的编译          编译看左边 （父亲有就可以访问，没有就不可以访问编译都通不过）
		//    成员变量的 访问        访问看左边  （访问的就是父亲里面变量的值）
		System.out.println(f.age);   // 成员变量的访问       看左边  这里左边是父亲
	//	System.out.println(f.name);  // 这里编译就出错了
		
		//多态中  成员方法的编译          编译看左边 （父亲有就可以访问，没有就不可以访问编译都通不过）
		//    成员方法的 访问        访问看右边  （如果儿子有访问的就是儿子的，，没有就访问父亲的）		
		f.work();
		//f.play();// 这里儿子有但是父亲没有  所以报错
		
		
		//多态中  静态方法的编译          编译看左边 （父亲有就可以访问，没有就不可以访问编译都通不过）
		//     静态方法的 访问        访问看左边边  （访问父亲的）	
		f.Sleep();
		
	}

}
class Fu{
	public int age =50;
	public void work(){
		System.out.println("工作挣钱");
	}
	public static void Sleep(){
		System.out.println("睡觉打呼");
	}
}
class Zi extends Fu{
	public int age =18;
	public String  name  ="小明";
	public void work(){
		System.out.println("学习知识");
	}
	public  void  play(){
		System.out.println("做游戏");
	}
	public static void Sleep(){
		System.out.println("z z Z Z");
	}
}

/*
50
学习知识
睡觉打呼
*/