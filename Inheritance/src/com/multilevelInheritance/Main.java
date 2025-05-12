package com.multilevelInheritance;

public class Main {
	public static void main(String[] args) {
		Labrador labrador = new Labrador();
		labrador.eat(); // Inherited method from Animal
		labrador.bark(); // Inherited method from Dog
		labrador.color(); // Method from Labrador
	}
}
