import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 100: ");
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) +1;

        while (true) {
            int input = scanner.nextInt();

            if(randomNumber<input) {
                System.out.println("Too high!");
            }
            else if(randomNumber>input) {
                System.out.println("Too low!");
            }
            else if(randomNumber==input) {
                System.out.println("WINNER WINNER CHICKEN DINNER!!!");
                System.out.println("The correct number was "+input);
                break; // Exits the loop
            }
            else if(input>100) {
                System.out.println("Invalid input.");
            }
        }

    }
}
