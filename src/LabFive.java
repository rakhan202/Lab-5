import java.util.Scanner;

/**
 * Created by Rizwan Khan on 6/29/2017.
 */
public class LabFive {

    public static void main(String[] args) {
        RollDie();
    }

    public static void RollDie(){
        Scanner scan = new Scanner(System.in);
        String choice = " ";

        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println("");

        do {
            System.out.println("How many sides should each die have? ");
            int dieSides = scan.nextInt();
            System.out.println("");

            System.out.println("Roll 1: ");

            int dieRoll = (int) (Math.random() * dieSides) + 1;
            int dieRoll2 = (int) (Math.random() * dieSides) + 1;

            System.out.println(dieRoll);
            System.out.println(dieRoll2);

            System.out.println("Roll again? (y/n): ");
            choice = scan.next();

        }while (choice.equalsIgnoreCase("Y"));

    }

}
