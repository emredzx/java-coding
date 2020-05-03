package memory_game;

import java.util.Scanner;

public class Main {
    public static Card[][] cards = new Card[4][4];
    public static void main(String[] args) {
        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('I');
        cards[1][0] = new Card('N');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('I');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('N');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');
        while (gameOver() == false){
            gameTable();
            guessIt();
        }
    }
    public static void guessIt(){
        Scanner console = new Scanner(System.in);
        System.out.print("Guess#1 (enter the values with one gap) : ");
        int x = console.nextInt();
        int y = console.nextInt();
        cards[x][y].setGuess(true);
        gameTable();
        System.out.print("Guess#2 (enter the values with one gap) : ");
        int i = console.nextInt();
        int j = console.nextInt();
        if (cards[x][y].getValue() == cards[i][j].getValue()){
            System.out.println("Correct Guess !!!");
            cards[i][j].setGuess(true);
        }
        else{
            System.out.println("Wrong Guess !!!");
            cards[x][y].setGuess(false);
        }

    }
    public static boolean gameOver(){
        for (int i = 0 ; i < 4;i++){
            for (int j = 0 ; j < 4 ; j++){
                if (cards[i][j].isGuess() == false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void gameTable(){
        for (int i = 0; i < 4; i++){
            System.out.println("___________________");
            for (int j = 0; j < 4; j++){
                if (cards[i][j].isGuess()){
                    System.out.print(" |" + cards[i][j].getValue() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("___________________");
    }
}