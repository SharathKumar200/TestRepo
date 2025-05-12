//Implement a simple array-based stack with push and pop operations.
package com.Arrays;

public class Assignment15 {
	private int[] array;
	private int top;

	public Assignment15(int size) {
		array = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (top >= array.length - 1) {
			System.out.println("Stack overflow!");
			return;
		}
		array[++top] = element;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow!");
			return -1;
		}
		return array[top--];
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top >= array.length - 1;
	}

	public static void main(String[] args) {
		Assignment15 stack = new Assignment15(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
}
