package conditional_statement_loop;

import java.util.Scanner;

public class DisplayLargeSmallNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter an integer number or Press 'end' to exit from program: ");
                int num = sc.nextInt();
                System.out.println("Please enter another integer number: ");
                int num1 = sc.nextInt();

                System.out.println("Maximum number is: " + Math.max(num, num1));
                System.out.println("Minimum number is: " + Math.min(num, num1));

            } catch (Exception e){
                String exit = sc.nextLine();
                if (exit == "end") {
                    break;
                }

            }
        }
    }
}
