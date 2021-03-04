package com.abstraction.practice;

public class Eater {
	public static void main(String[] args) {
		PizzaMaker p = new PizzaMaker();
		p.pizzabase("paneer", 25);
		PizzaMaker2 p2 = new PizzaMaker2();
		p2.pizzabase("mashroom", 20);
	}
}
