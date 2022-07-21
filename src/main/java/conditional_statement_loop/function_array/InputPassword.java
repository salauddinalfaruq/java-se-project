package conditional_statement_loop.function_array;

import java.util.Scanner;

public class InputPassword {
    public static void main(String[] args) {

        int count = 0;
        String password = "adm1n";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String userPassword = sc.next();

        while (count <= 2){
            if(password != userPassword){
                System.out.println("Your password is wrong! Please try again");
                userPassword = sc.next();
            }
            else {
                System.out.println("Login Successful");
                break;
            }
            count++;
        }
        if (count > 2){
            System.out.println("You account is temporary locked!");
        }
    }
}
