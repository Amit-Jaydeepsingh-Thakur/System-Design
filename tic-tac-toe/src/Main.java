import com.tictactoe.util.TicTacToe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe");

        TicTacToe game = new TicTacToe(3);

        System.out.println(game.move(0, 0, 0));
        System.out.println(game.move(1, 1, 0));
        System.out.println(game.move(0, 1, 1));
        System.out.println(game.move(1, 2, 1));
        System.out.println(game.move(0, 2, 2));
        System.out.println(game.move(10, 0, 0));

    }
}
