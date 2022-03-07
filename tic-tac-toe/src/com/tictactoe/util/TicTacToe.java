package com.tictactoe.util;

public class TicTacToe {
    int capacity;
    int[][] board;

    public TicTacToe(int n) {
        this.capacity = n;
        this.board = new int[n][n];
    }

    public int move(int player, int row, int col) throws IllegalArgumentException {
        if (row < 0 || col < 0 || row >= capacity || col >= capacity) {
            throw new IllegalArgumentException("Out of the Board Move");
        } else if (player != 0 && player != 1) {
            throw new IllegalArgumentException("Invalid Player");
        } else if (board[row][col] != 0) {
            throw new IllegalArgumentException("The board is already occupied");
        } else {
            int temp = 0;
            if (player == 0) {
                board[row][col] = -1;
                temp = -1;
            }
            else {
                board[row][col] = +1;
                temp = 1;
            }
            int i = 0;
            boolean winner = true;

            // check for the row
            for (i = 0 ; i < capacity; i++) {
                if (board[row][i] != temp) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return (player == 0 ? -1 : 1);
            }

            // check for the col
            winner = true;
            for (i = 0 ; i < capacity; i++) {
                if (board[i][col] != temp) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return (player == 0 ? -1 : 1);
            }

            // check for the diagonal
            int j = 0;
            winner = true;
            for (i = 0, j = 0 ; j < capacity && i < capacity; i++, j++) {
                if (board[i][j] != temp) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return (player == 0 ? -1 : 1);
            }

            // check for the reverse diagonal
            j = 0;
            winner = true;
            for (i = capacity - 1, j = 0 ; i >= 0 && j < capacity; i--, j++) {
                if (board[i][j] != temp) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return (player == 0 ? -1 : 1);
            }

            System.out.println("None is the winner");

            return 0;
        }
    }
}
