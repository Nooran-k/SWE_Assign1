import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println(" Welcome to Safe or BOOM\n");
        System.out.println("Rules: you have a set of cookies , each player picks one cookie to turn it into a bomb\n" +
                "your opponent doesn't know which one you picked, you don't know what they picked either\n" +
                "keep picking cookies until one of you hits a bomb\n" +
                "tip: If you pick your own bomb you will lose \n");

        Scanner scanner= new Scanner(System.in);
        //BOARD
        char[][] board = new char[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = 'c';
            }
        }

        Player player1=new Player();
        Player player2=new Player();
        player1.setName(scanner);
        player2.setName(scanner);
        printBoard(board);
        player1.setBombPos(scanner);
        printBoard(board);
        player2.setBombPos(scanner);

        printBoard(board);
        while (true) {

            player1.getChoice(scanner);
            if (board[player1.choiceX][player1.choiceY] == 'e') {
                System.out.println("already eaten , choose another one");
                continue;
            }

            else if (player1.choiceX == player2.bombX && player1.choiceY == player2.bombY || player1.choiceX == player1.bombX && player1.choiceY == player1.bombY) {
                System.out.println("BOOM , you lose!");
                return;
            }
            else {
                board[player1.choiceX][player1.choiceY]='e';
                System.out.println("SAFE");
                printBoard(board);

            }

            player2.getChoice(scanner);
            if (board[player2.choiceX][player2.choiceY] == 'e') {
                System.out.println("already eaten , choose another one");
                continue;
            }

            if (player2.choiceX==player1.bombX && player2.choiceY==player1.bombY || player2.choiceX==player2.bombX && player2.choiceY==player2.bombY){
                System.out.println("BOOM ! YOU LOSE");
                return;
            }
            else {
                board[player2.choiceX][player2.choiceY]='e';

                System.out.println("SAFE");
                printBoard(board);
            }
        }

    }
    static void printBoard(char[][] board) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 'e') {
                    System.out.print(" 😋 ");
                } else {
                    System.out.print(" 🍪 ");
                }
            }
            System.out.println();
        }
    }


}
