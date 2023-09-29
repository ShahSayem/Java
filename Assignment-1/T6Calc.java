import java.util.Scanner;
public class T6Calc {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter your option: ");
        String opt = sc.next();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        switch (opt){
            case "1":
                System.out.println("Result: "+(a+b));
                break;
            case "2":
                System.out.println("Result: "+(a-b));
                break;
            case "3":
                System.out.println("Result: "+(a*b));
                break;
            case "4":
                System.out.println("Result: "+(a/b));
                break;
            case "5":
                System.out.println("Result: Program terminated");
                break;
            default:
                System.out.println("Result: Invalid option!!!");
                break;
        }
    }
}
