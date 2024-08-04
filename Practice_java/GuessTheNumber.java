import java.util.*;
public class GuessTheNumber {
    public static void main(String args[]) {
        int n = 7;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100);

        System.out.println("Guess the Numbers:");
        do {
            System.out.println("You have " + n + " Chances Left :");
            int i = s.nextInt();
            if (i > num) {
                System.out.println("You Guess too high!\n-----------------------------");
            } else if (i < num) {
                System.out.println("You Guess too Low!\n------------------------------");
            } else if (num == i) {
                System.out.println("You Found the number!!");
                n = 0;
            }
            n--;
        } while (n > 0);
    }
}
