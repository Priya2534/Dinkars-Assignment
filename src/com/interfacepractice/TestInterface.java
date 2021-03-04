package com.interfacepractice;

public class TestInterface {

	public static void main(String[] args) {
		Drawable d = new Circle();
		Drawable t = new Rectangle();
		t.draw(); // 
		d.draw();
		// Drawable f = new Drawable(); can not create an obj of interface
	}

}
