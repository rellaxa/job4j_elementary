package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new  float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Johnny Depp";
        names[1] = "Jennifer Lawrence";
        names[2] = "Jessica Chastain";
        names[3] = "Ryan Gosling";
        String actor = names[1];
        System.out.println(actor);
        System.out.println(names[3]);
        System.out.println(names[0]);
        System.out.println(names[2]);
    }
}
