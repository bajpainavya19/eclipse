package com.pack;
class shape{
	void color() {
		System.out.println("I have blue color");
		System.out.println("i also have red color");
	}
	void size() {
		System.out.println("I ahve circle");
		System.out.println("I have square");
	}
}
class Circle extends shape{
	void nature() {
		System.out.println("I have round in shape");
	}
}
class square extends Circle{
	void say() {
		System.out.println("I can inherit the property of both class i.e. circle and shape");
	}
}
public class multiInherit {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.nature();
		obj.color();
		obj.size();
		square obj1 = new square();
		obj1.say();
		obj1.nature();
		obj1.color();
		obj1.size();

	}

}
