package conditional_statement_loop;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check the number is prime or not: ");
        int num = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a  prime number");
        }
    }
}
