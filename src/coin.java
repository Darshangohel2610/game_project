import java.util.*;
public class coin {
    static int coins=0;
 static void coin(){
     System.out.println("HOW MANY COINS YOU WANT TO BUY ? \n (PER COIN COST IS 50 RUPEES)");
     Scanner sc = new Scanner(System.in);
     coins = sc.nextInt();
     System.out.println("Now you have "+coins+" coins");
 }
}
