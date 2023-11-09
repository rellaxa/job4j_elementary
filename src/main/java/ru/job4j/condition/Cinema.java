package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the club buddy");
        } else {
            System.out.println("Sorry dude, it's not for u");
        }
    }

    public static void main(String[] args) {
        access(21);
        access(16);
    }
}
