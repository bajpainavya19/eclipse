package com.pack;
class Mother{
	void Big() {
		System.out.println("I am the only mother of two of you");
	}
}
class Daughter extends Mother{
	 void eyes() {
		 System.out.println("I am having the eyes like my mother");
	 }
}
class Son extends Mother{
	void color() {
		System.out.println("I am having the fair color as my mother");
	}
}
public class hierarchiInherit {
      public static void main(String args[]) {
    	  Daughter obj = new Daughter();
    	  obj.eyes();
    	  obj.Big();
    	  Son obj1 = new Son();
    	  obj1.color();
    	  obj1.Big(); 
      }
}
