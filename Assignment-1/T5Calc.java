import java.util.Scanner;
public class T5Calc {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        System.out.print("Enter your option: ");
        Scanner sc = new Scanner(System.in);
        String opt = sc.next();
        double a, b;

        switch (opt){
            case "1":
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result: "+(a+b));
                break;
            case "2":
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result: "+(a-b));
                break;
            case "3":
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result: "+(a*b));
                break;
            case "4":
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
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
