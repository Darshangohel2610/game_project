import java.util.*;
public class ending  {
    Scanner sc  =  new Scanner(System.in);
    game_intro ob =  new game_intro();
    void end(int y)
    {
        System.out.println("now you have "+y+" coins ");
        System.out.println("do you want to play again ?\n if yess than enter 1 if no than enter 2 ");
        int i = sc.nextInt();
        if(i == 1)
        {
            ob.gameintro();
        }
        if(i == 2)
        {
            System.out.println("ThankYou for playing Game of Fortune\n don't forget to convert your coins into rupees from desk \n :-)");
        }
    }
}
