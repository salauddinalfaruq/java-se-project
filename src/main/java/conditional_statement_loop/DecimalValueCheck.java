package conditional_statement_loop;

import java.util.Scanner;

public class DecimalValueCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first decimal number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second decimal number: ");
        double num2 = sc.nextDouble();

        if(Math.abs(num1-num2) <= 0.00){
            System.out.println("These numbers are same");
        }
        else{
            System.out.println("These numbers are different");
        }
    }
}
