package com.pack;
class Bank{
	void RateOfInterest() {
		System.out.println("rate of interests for the BANK is 5% including GST");
	}
}
class SBI extends Bank{
	
	void RateOfInterest() {
		System.out.println("rate of interest of SBI is 6.5% icluding GST");
	}
}
class RBI extends Bank{
	
	void RateOfInterest() {
	System.out.println("rate of interest of RBI is 5.1% including GST");
	}
}

public class overridingMethod {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.RateOfInterest();
		SBI obj1 = new SBI();
		obj1.RateOfInterest();
		RBI obj2 = new RBI();
		obj2.RateOfInterest();
	}

}
