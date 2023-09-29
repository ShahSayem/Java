import java.util.Random;
import java.util.Scanner;

public class T2_guessNum{
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100), guess;

        if (n == 0)
            n++;

        do {
            System.out.print("Enter your guessed value (1-100): ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            if (guess == n){
                System.out.println("Congratulations! You guessed the number.");
            }
            else if (guess < n){
                System.out.println("Too low, try again.");
            }
            else {
                System.out.println("Too high, try again.");
            }
        } while(guess != n);
    }
}
