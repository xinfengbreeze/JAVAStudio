package com.itcast.www.classlodder;

public class Person {
    public String name  ="xiaoming";
    protected String address;
    private int age;
    int number;
    
    public Person(){
    	
    }
    
    public Person( String name,  String address){
    	this.name  = name;
    	this.address  =address;
    	
    }
    public Person(String name , int age ,String address){
    	
    }
    private  Person( String name,  String address ,int age){
    	this.name  = name;
    	this.address  =address;
    	
    }
    

	public  void show(){
    	System.out.println("调用了Person类的public修饰的 show");
    }
    
    private void show2(String s){
    	System.out.println("调用了Person类的private修饰的 show2"+ s);
    }
    
    
    
    
    
    @Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ ", number=" + number + "]";
	}

}
