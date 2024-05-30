package com.pack;
class Student{
	private String name;
	private int rollno;
	private int age;
	
	public String getname() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public int getAge() {
		return age;
	}
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setRollno(int rollno) {
		 this.rollno = rollno;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
}
public class encapsulated {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Navya");
		obj.setRollno(22);
		obj.setAge(126);
		System.out.println(obj.getname());
		System.out.println(obj.getRollno());
		System.out.println(obj.getAge());

	}

}
