import java.util.Scanner;

public class T3_bookstore{
    public static void main(String[] args) {

        String bookName[] = new String[10];
        double bookPrice[] = new double[10];

        String name;
        double price, sumPrice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 book name and their prices: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Book name "+(i+1)+ ": ");
            name = sc.next() ;
            bookName[i] = name;

            System.out.print("Book price "+(i+1)+ ": ");
            price = sc.nextDouble() ;
            bookPrice[i] = price;

            sumPrice += price;
        }

        System.out.println("Book names and their prices: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(bookName[i]+" "+bookPrice[i]);
        }

        System.out.println("Total cost of all books: "+sumPrice);
    }
}
