package com.trioedge;

import java.util.Scanner;

public class AirthmeticOperation {
    int s1;
    int s2;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter first number: ");
        s1 = sc.nextInt();

        System.out.print("Enter second number: ");
        s2 = sc.nextInt();
    }

    int sum() {
        return s1 + s2;
    }

    int sub() {
        return s1 - s2;
    }

    int mul() {
        return s1 * s2;
    }

    int div() {
        if (s2 != 0) {
            return s1 / s2;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }

    public static void main(String args[]) {
        AirthmeticOperation obj = new AirthmeticOperation();
        obj.input();

        System.out.println("sum: " + obj.sum());
        System.out.println("sub: " + obj.sub());
        System.out.println("mul: " + obj.mul());
        System.out.println("div: " + obj.div());
    }

}
