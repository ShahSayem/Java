import java.util.Scanner;

public class T1B_Vote{
    public static void main(String[] args) {
        int n;

        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n >= 18){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote yet.");
        }
    }
}
