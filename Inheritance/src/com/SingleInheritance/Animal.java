package com.SingleInheritance;



/*
 * In Java, inheritance is a fundamental feature of object-oriented programming
 * that allows one class (subclass or derived class) to inherit the properties
 * and behaviors of another class (superclass or base class). There are
 * different types of inheritance relationships based on how classes are derived
 * and how inheritance is implemented.
 * 
 */
// Superclass
public class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

// Subclass inheriting from Animal
class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}


// Main class to demonstrate single inheritance

	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat(); // Inherited method from Animal
	        dog.bark(); // Method from Dog
	    }
	}


