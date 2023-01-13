package org.example;

import org.example.testing.TestingUtiity;

public class Main {
    public static void main(String[] args) {
        TestingUtiity testingUtiity = new TestingUtiity();
       var somma = testingUtiity.summary(10,5);
        System.out.println("somma equivae - " + somma);
    }
}