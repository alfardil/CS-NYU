import java.util.Scanner;

public class BankTeller {
    public static void main(String[] args) {
        // initialize account amount (1000)
        float accountAmount = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your Bank account!");
        System.out.println("What would you like to do? ");
        System.out.println();
        // make options for the user 
        while (true) {
        System.out.println("Withdraw");
        System.out.println("Deposit");
        System.out.println("Summary");
        System.out.println("Exit");
        String choice = "";
        choice = scanner.next().toLowerCase().trim();
            // withdraw
            if (choice.equals("withdraw")) {
                while (true) {
                    System.out.println("How much money would you like to withdraw? ");
                    float withdraw = scanner.nextFloat();

                    if (withdraw <= 0) {
                        System.out.println("Enter a positive number please!");
                        System.out.println();
                    } 
                    else if (withdraw > accountAmount){
                        System.out.println("You don't have that much money!");
                        System.out.println();
                    }
                    else {
                        System.out.println("You have withdrawn $" + withdraw);
                        accountAmount -= withdraw;
                        System.out.println();
                        break;
                    }
                }
            }
            // deposit
            else if (choice.equals("deposit")) {
                while (true) {
                    System.out.println("How much money would you like to deposit? ");
                    float deposit = scanner.nextFloat();

                    if (deposit <= 0) {
                        System.out.println("Enter a positive number please!");
                        System.out.println();
                    }
                    else {
                        System.out.println("You have deposited $" + deposit);
                        accountAmount += deposit;
                        System.out.println();
                        break;
                    }
                }
            }
            // summary
            else if (choice.equals("summary")) {
                while (true) {
                    System.out.println();
                    System.out.println("Here is your banking summary: ");
                    System.out.println("Balance: $" + accountAmount);
                    System.out.println();
                    break;
                }
            }
            // exit 
            else if (choice.equals("exit")) {
                break;
            }

            else {
                System.out.println("Not a valid choice. Try again!");
            }

        }
        scanner.close();
    }

}
