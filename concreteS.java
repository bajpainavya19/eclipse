package com.pack;
abstract class Demo1{
	  abstract void show();
	   void view() {
		   System.out.println("this is  concrete method of abstract");
	   }
}
class Start1 extends Demo1{

	@Override
	void show() {
		System.out.println("this ");// TODO Auto-generated method stub
		
	}
	 
}
public class concreteS {

	public static void main(String[] args) {
		 Start1 s=new Start1();
		 // calling an object of the Start class
		 s.show();
		  // Calling the concrete method
		 s.view();
		
	}

}
