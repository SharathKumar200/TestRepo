package com.random;


import java.util.Random;

public class Arrays {
    Random random = new Random();

    void randomarrays() {
        byte[] randomByteArray = new byte[6];
        random.nextBytes(randomByteArray);

        System.out.println("Arrays:"+randomByteArray);
    }

    public static void main(String[] args) {
        Arrays example = new Arrays();
        example.randomarrays();
    }
}