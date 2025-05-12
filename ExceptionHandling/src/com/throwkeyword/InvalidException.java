package com.throwkeyword;

class InvalidAgeException extends Exception {
    // No-arg constructor
    public InvalidAgeException(String str) {
       super(str)/*("Invalid age: Age must be greater than 20")*/;//calling super class consby passing our info
    }
}