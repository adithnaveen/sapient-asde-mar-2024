package com.sapient;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int resa = addNumber(11, 33);
        int ress = subNumber(444, 44);
    }

    public static int addNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static int subNumber(int num1, int num2) {
        return num1 - num2;
    }

}
