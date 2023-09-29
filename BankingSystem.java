import java.util.Scanner;

class Client {
    private int id;
    private String name;
    private double amount = 0;

    public void setID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class BankingSystem{
    public void depositMethod(Client x, double money){
        double amount = x.getAmount();
        amount += money;
        x.setAmount(amount);
    }

    public void withdrowMethod(Client x, double money){
        double amount = x.getAmount();

        amount -= money;
        x.setAmount(amount);
    }

    public static void main(String[] args) {
        BankingSystem bank1 = new BankingSystem();
        Client c1 = new Client();
        c1.setID(1);
        c1.setName("Sayem");
        c1.setAmount(5000);

        System.out.println("Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your option: ");
        Scanner sc = new Scanner(System.in);
        String opt = sc.next();
        double deposit, withdraw;

        switch (opt){
            case "1":
                System.out.print("Current Balance: "+c1.getAmount());
                break;
            case "2":
                System.out.print("Enter deposit money: ");
                deposit = sc.nextDouble();
                bank1.depositMethod(c1, deposit);
                System.out.print("Current Balance: "+c1.getAmount());
                break;
            case "3":
                System.out.print("Enter withdraw money: ");
                withdraw = sc.nextDouble();
                if (withdraw > c1.getAmount())
                    System.out.println("You do not have sufficient balance");
                else {
                    bank1.withdrowMethod(c1, withdraw);
                    System.out.print("Current Balance: "+c1.getAmount());
                }
                break;
            case "4":
                System.out.println("Program terminated");
                break;
            default:
                System.out.println("Invalid option!!!");
                break;
        }
    }
}
