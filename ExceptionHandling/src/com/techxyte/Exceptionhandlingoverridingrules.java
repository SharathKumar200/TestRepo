package com.techxyte;

//Exception handling in method overriding rules we can only throw unchecked exception in child class not checked exception
//no exception in parent method is valid and child with un-checked exception valid
//parent and child with same exception is valid
//if parent class throws an exception and child class not throws an exception is valid
//parent to child[E-AE] is valid reverse is not valid
public class Exceptionhandlingoverridingrules {

	void mrg() {
		System.out.println("marrige");
	}
}
