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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean array = monoVertical(new char[][]{
                {'X', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', ' ', ' '},
        }, 0);
        System.out.println(array);
        array = monoVertical(new char[][]{
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '},
        }, 1);
        System.out.println(array);
    }
}
