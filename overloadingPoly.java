package com.pack;
class Overloading{
	void sum(int a, int b) {
		System.out.println( a+b);
	}
	void sum(String a, String b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
public class overloadingPoly {

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(4, 7);
		obj.sum("Navya ", "Bajpai");
		obj.sum(21, 23);

	}

}
