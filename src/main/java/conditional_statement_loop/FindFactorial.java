package conditional_statement_loop;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to find the factorial ");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial is: " + sum);
    }
}
