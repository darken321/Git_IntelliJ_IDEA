package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int aa=2;
        int bb = 5;
        System.out.println("сумма " + aa + " + " + bb + " = " + plus(2, 5));
        System.out.println("произведение " + aa + " Х " + bb + " = " + multiplication(2, 5));
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static void hello() {
        System.out.println("hello!!");
    }
}