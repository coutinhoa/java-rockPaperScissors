import java.util.Scanner;


public class Main {
    // type rock paper or scissors
    //program randomly selects with their own play and then tell if we won or not
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type rock, paper or scissors and see if you win the game");
        RockPaperScissors game = new RockPaperScissors();


        String input = scanner.nextLine();

        game.play(input);

            if (input.equals("")) {
                System.out.println("You don't wanna play.");
                return;
            }
            else {
                game.play(input);
                System.out.println(game.checkWinner());
            }
    }
}