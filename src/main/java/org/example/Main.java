package org.example;

class Main {
    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void count() {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        count();
        count();
    }
}