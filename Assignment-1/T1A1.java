import java.util.Scanner;

public class T1A1 {
    public static void main(String[] args) {
        int n;

        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
