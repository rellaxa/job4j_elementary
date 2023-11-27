package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean array = monoHorizontal(new char[][]{
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        }, 1);
        System.out.println(array);
        array = monoHorizontal(new char[][]{
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '},
        }, 2);
        System.out.println(array);
    }
}
