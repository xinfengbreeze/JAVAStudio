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
    	System.out.println("������Person���public���ε� show");
    }
    
    private void show2(String s){
    	System.out.println("������Person���private���ε� show2"+ s);
    }
    
    
    
    
    
    @Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ ", number=" + number + "]";
	}

}
