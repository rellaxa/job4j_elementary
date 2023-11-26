package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] rsl = {
                {1, -2},
                {1, 2}
        };
        int[][] test = skip(rsl);
        for (int[] ints : test) {
            for (int val : ints) {
                System.out.println(val);
            }
        }
    }
}
