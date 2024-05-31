package com.pack;
abstract class Vehicle {
	  abstract void start();
	  
}
  class Car extends  Vehicle{

	@Override
	void start() {
		 System.out.println(" car start with self");
	}
	   
  }
   class Bike extends Vehicle{

		@Override
		void start() {
			 System.out.println(" Bike Start with kick");
		}
   	
   }
public class abstractClass2 {

	public static void main(String[] args) {
		 Car c=new Car();
		 c.start();
			 Bike b=new Bike();
			  b.start();
			
		
		
	}

}
