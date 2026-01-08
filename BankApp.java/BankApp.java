import java.util.Scanner;

public class BankApp {
    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking Application ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the banking app");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}