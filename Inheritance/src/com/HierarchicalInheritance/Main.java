package com.HierarchicalInheritance;

public class Main {
	// Main class to demonstrate hierarchical inheritance

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat(); // Inherited method from Animal
		dog.bark(); // Method from Dog

		Cat cat = new Cat();
		cat.eat(); // Inherited method from Animal
		cat.meow(); // Method from Cat
	}
}
