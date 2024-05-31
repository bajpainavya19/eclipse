package com.pack;
abstract class numbers{
	abstract void Nine();
	void Six() {
		System.out.println("The number is six");
		System.out.println("this is a concrete method");
	}
}
class Two extends numbers{
	 void Nine() {
		System.out.println("in this number two, nine is also there");
	}
}
public class concreteMethod {

	public static void main(String[] args) {
	  Two to = new Two();
	  //this is abstract method
	  to.Nine(); 
	  //this is a concrete method
	  to.Six();

	}

}
