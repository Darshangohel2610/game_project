import java.sql.SQLOutput;
import java.util.*;
public class game_intro extends coin {
    Scanner sc = new Scanner(System.in);
    void gameintro()
    {
        System.out.println("Which game you want to play?\n Enter 1 for NUMBER GUESSING GAME \n Enter 2 for JACKPOT GAME \n Enter 3 for ROCK PAPER SCISSOR GAME");
        System.out.println("per game you need 1 coin");
        int n = sc.nextInt();
        games ob = new games();
        if(n == 1)
        {
            ob.num_guesing();
        }
        if(n == 2)
        {
            ob.jackpot();
        }
        if(n == 3)
        {
            ob.rps();
        }
    }
}
