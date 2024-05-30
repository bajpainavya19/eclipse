package com.pack;
interface Cycle{
	void Break(int dec);
	void speed(int inc);
}
interface horn{
	void blowHorn();
}
class Avon implements Cycle, horn{
	public void Break(int dec) {
		System.out.println("break");
	}
	public void speed(int inc) {
		System.out.println("speed up");
	}
	public void blowHorn() {
		System.out.println("pee pooo laa laaa");
	}
}
public class interfa {

	public static void main(String[] args) {
		Avon obj = new Avon();
		obj.Break(0);
		obj.speed(1);
		obj.blowHorn();
	}

}
