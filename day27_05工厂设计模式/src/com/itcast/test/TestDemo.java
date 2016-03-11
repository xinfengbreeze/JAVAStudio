package com.itcast.test;

public class TestDemo {
		public  static void  main(String[] args){
			Animal a = AnimalFactory.getCat();
			a.action();
			
			Animal b = AnimalFactory.getDog();
			b.action();
			
		}
}
