import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    private String computer_result;
    private String userPlay;
    public void play(String userPlay) throws Exception {

        //save the value of the user play
        if (!userPlay.equals("rock") && !userPlay.equals("paper") && !userPlay.equals("scissors")) {
            throw new Exception("you need to input either scissors, paper or rock!!!");
        }
        this.userPlay= userPlay;

        //will generate the computer play
        ArrayList<String> play = new ArrayList<String>();
        play.add("rock");
        play.add("paper");
        play.add("scissors");

        Random computer_play = new Random();
        for (int i = 0; i < play.size(); i++) {
            int index = computer_play.nextInt(play.size());
            computer_result = play.get(index);
            //System.out.println("computer result: "+ computer_result);
        }
        //return play.get(index);
        System.out.println("computer result: "+ computer_result);
    }

    //compares the play of computer and play and checks who won or if it's a tie
    //Main is the only class that prints in the console unless it is for debugging
    public String checkWinner() {
        if(computer_result.equals("scissors") && userPlay.equals("rock") || computer_result.equals("paper") && userPlay.equals("scissors")  )
        {return "user";}
        else if (userPlay.equals("scissors") && computer_result.equals("rock") || userPlay.equals("paper") && computer_result.equals("scissors"))
        {return "computer";}
        else {return "tie";}
    }
}
