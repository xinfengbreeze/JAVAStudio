package com.itcast.test;
//  �򵥹��� ģʽ   �����û���ȡ����
public class AnimalFactory {
		public static  Animal getDog(){
			return new Dog();
		}
		
		public static Animal getCat(){
			return  new Cat();
		}
}
