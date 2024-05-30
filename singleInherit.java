package com.pack;
 class Parent {
	int b = 22;
	void show() {
		
		System.out.println("i am having only one child");
		System.out.println("Only that child able to inherit my property");
	}
	void say() {
		System.out.println("Hello how are you");
	}
	void sound() {
		System.out.println("peee poooo");
	}
}
 class Child extends Parent{
	void me() {
		System.out.println("I am the only child of my parent");
	}
	void say() {
		System.out.println("I am fine");
	}
}
public class singleInherit {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.me();
		obj.show();
		Parent obj1 = new Parent();
	    System.out.println(obj1.b);
        Parent p = new Child(); //upcasting child class object to parent classs object
        p.say();
        Child C = (Child)p; // downcasting parent- class object to child class object
        C.sound();
	}

}
