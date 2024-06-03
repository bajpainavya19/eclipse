package com.pack;
interface School{
	void Data();
}
interface Absentees{
	void totalStudent();
}

class Nine implements School, Absentees{
	public void Data() {
		String name= "Navya";
		int roll = 126;
		System.out.println("name of student: " + name);
		System.out.println("roll of student: " + roll);
		
	}
	public void totalStudent() {
		int stud = 4;
		System.out.println("total no. of students who are absent: " + stud);
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nine obj = new Nine();
		obj.Data();
		obj.totalStudent();

	}

}
