package com.pack;
abstract class shape{
	abstract void color();
	abstract void size();
}
class circle extends shape{
	public void color() {
		System.out.println("It's red in color");
	}
	public void size() {
		System.out.println("it's round in shape");
	}
}
public class abstractClass {

	public static void main(String[] args) {
		circle obj = new circle();
		obj.color();
		obj.size();

	}

}
