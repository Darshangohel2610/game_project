import java.sql.SQLOutput;
import java.util.*;
import java.util.Random;
public class games extends coin{
    Scanner  sc = new Scanner(System.in);
    Random rn = new Random();
    ending ob = new ending();
    void num_guesing() {
        int guess, i = 0;
        if (coins <= 0) {
            System.out.println("you don't have sufficient coins to play game\n please restart game and add sufficient coins ");
            System.exit(0);
        }else{
        System.out.println("welcome to number guessing game ");
        int random = rn.nextInt(101);
        do {
            System.out.println("enter number in range of 100");
            guess = sc.nextInt();
            if (guess > random) {
                System.out.println("too bigger number\n enter smaller number ");
                i++;
            } else if (guess < random) {
                System.out.println("too smaller number \n enter bigger number");
                i++;
            } else {
                System.out.println("you guess right number \n you won game :-)");
            }
        } while (random != guess);
        System.out.println("you win game in " + i + " attempts");
    }
        coins--;
        ob.end(coins);
    }
    void jackpot()
    {
        if(coins <= 0)
        {
            System.out.println("you don't have sufficient coins to play game\n please restart game and add sufficient coins ");
            System.exit(0);
        }else {
            System.out.println("welcome to jackpot game");
            System.out.println("you have 3 tries");
            for(int j = 0;j<3;j++) {
                System.out.println("enter any number to check your luck :-)");
                int n = sc.nextInt();
                int num1 = rn.nextInt(10);
                int num2 = rn.nextInt(10);
                int num3 = rn.nextInt(10);
                if (num1 == num2 && num2 == num3) {
                    System.out.println("COOL IT'S JACKPOT!!!\n"+"jackpot number is :--)   "+num1+" "+num2+" "+num3);
                } else {
                    System.out.println("SORRY BETTER LUCK NEXT TIME:-(\n"+"numbers are -----"+num1+" "+num2+" "+num3+"-----");
                }
            }
        }
        coins--;
        ob.end(coins);
    }
    void rps()
    {
        if(coins <= 0)
        {
            System.out.println("you don't have sufficient coins to play game\n please restart game and add sufficient coins ");
            System.exit(0);
        }
        else {
            System.out.println("welcome to rock paper scissor game");
            int computer = rn.nextInt(1, 4);
            System.out.println("enter 1 for rock \n enter 2 for paper \n enter 3 for scissor ");
            int user = sc.nextInt();
            final int rock = 1;
            final int paper = 2;
            final int scissor = 3;
            if((user == rock && computer == rock) ||( user == paper && computer == paper ) ||( user == scissor && computer == scissor))
            {
                System.out.println("match is draw");
            }
            else if((user == rock && computer == paper)||(user == paper && computer == scissor)||(user == scissor && computer == rock))
            {
                System.out.println("you loss :-(");
            }else if ((computer == rock && user == paper )||(computer == paper && user == scissor)||(computer == scissor && user == rock))
            {
                System.out.println("you win :-)");
            }
        }
        coins--;
        ob.end(coins);
    }
}
