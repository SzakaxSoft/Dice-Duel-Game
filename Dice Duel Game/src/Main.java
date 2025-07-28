import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dice Duel Game");

        Scanner question = new Scanner(System.in);
        System.out.print("Do you want to play? (1/yes, 2/no): ");
        int respond = question.nextInt();

        if (respond == 1) {
            System.out.println("Let's play");
            Random myNum = new Random();
            int randomNum = myNum.nextInt(1, 7);
            System.out.println("Your number is: " + randomNum);

            Random yourNum = new Random();
            int randomNum1 = yourNum.nextInt(1, 7);
            System.out.println("My number is: " + randomNum1);

            if (randomNum > randomNum1) {
                System.out.println("Your number is bigger, You WON!");
            } else if (randomNum == randomNum1) {
                System.out.println("The numbers ae equal, play again!");
            } else {
                System.out.println("My number is bigger, You LOST!");
            }
            System.out.println("Thank you for playing");

        } else if (respond == 2) {
            System.out.println("Thank you for your time!");
        }
    }
}