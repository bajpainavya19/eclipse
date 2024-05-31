package com.pack;
abstract class ship{
	abstract void features();
	abstract void speed();
}
 class Boat extends ship{
	 public void features() {
		 System.out.println("This boat is able to extract all the features of ship class");
	 }
	 public void speed() {
		 System.out.println("this is very fast in speed");
	 }
 }
 class babyBoat extends ship{
	 public void features() {
		 System.out.println("less features then ship class");
	 }
	 public void speed() {
		 System.out.println("less speed then boat");
	 }
 }
public class abstractClass1 {
	public static void main(String args[]) {
		Boat bo = new Boat();
		bo.features();
		bo.speed();
		babyBoat ba = new babyBoat();
		ba.features();
		bo.speed();
	}

}
