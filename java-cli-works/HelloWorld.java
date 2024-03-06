package com.naveen;

// compiling - javac -d . HelloWorld.java 
// to execute - java com.naveen.HelloWorld 

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello world");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}
