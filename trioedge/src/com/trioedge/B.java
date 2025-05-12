package com.trioedge;

public class B{
class A {
	public int m() {
		return 0;
	}
}

interface C1 {
	default int m() {
		return 1;
	}
}

interface C2 {
	default int m() {
		return 2;
	}
}

class D extends A implements C1, C2 {
	public int p() {
		return m() + C1.super.m() + C2.super.m();
	}
}
}