package com.pack;
class Person{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Passport{
	private int passportNo;
	
	public void setpassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	
	public int getpassportNo() {
		return passportNo;
	}
}
public class OnetooneAssociation {

	public static void main(String[] args) {
		Person obj = new Person();
		Passport obj1 = new Passport();
		obj.setName("Navya");
		System.out.println(obj.getName() + ": Name of first person");
		
		obj1.setpassportNo(34567);
		System.out.println(obj1.getpassportNo() + ": Passport no. of first person");
		
		
		obj.setName("Isha");
		System.out.println(obj.getName() + ": Name of second person");
		
		obj1.setpassportNo(56783);
		System.out.println(obj1.getpassportNo() + ": Passport no. of second person");
      
	}

}
