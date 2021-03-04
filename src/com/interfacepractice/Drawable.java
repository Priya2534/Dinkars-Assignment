package com.interfacepractice;
/*Every field in interface is by default static,public and final and every method is public 
and abstract.. you can not create an object of an interface ...constructor is not present 
for interface..multiple inheritance is possible..
also while creating obj of child class interface constructor is not called it saves the time of 
execution. in abstraction constructor of abstract class is called*/

public interface Drawable {
	void draw();

}

class Circle implements Drawable {
	public void draw() {
		System.out.println("Draw a Circle");
	}
}

class Rectangle extends Circle implements Drawable {
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}