package com.itcast.test;
//  简单工厂 模式   帮助用户获取对象
public class AnimalFactory {
		public static  Animal getDog(){
			return new Dog();
		}
		
		public static Animal getCat(){
			return  new Cat();
		}
}
