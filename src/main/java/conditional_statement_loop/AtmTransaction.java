package conditional_statement_loop;

import java.util.Scanner;

public class AtmTransaction {
    public static void main(String[] args) {

        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome the ATM Booth");
            System.out.println("Enter 1 for withdraw money:");
            System.out.println("Enter 2 for deposit money:");
            System.out.println("Enter 3 for check balance:");
            System.out.println("Enter 4 for exit:");
            System.out.println("Enter your choice:");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Enter amount to be withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Enter amount to be deposit: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money is successfully deposited");
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("Your balance is: " + balance);
                    System.out.println("\n");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
