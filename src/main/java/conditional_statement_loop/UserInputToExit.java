package conditional_statement_loop;

import java.util.Scanner;

public class UserInputToExit {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                System.out.println("Please enter a number to sum or Enter q to exit: ");
                int num = sc.nextInt();
                sum = sum + num;
                System.out.println("Sum is: " + sum);
            }
            catch (Exception e){
                char ch = sc.next().charAt(0);
                if (ch == 'q') {
                    System.out.println("You are Exit from the program");
                    break;
                }
            }
        }
    }
}
