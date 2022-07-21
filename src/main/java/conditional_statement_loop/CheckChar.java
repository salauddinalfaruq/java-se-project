package conditional_statement_loop;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+ " is a capital letter");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch+ " is a small letter");
        }
        else{
            System.out.println("Please enter a character");
        }
    }
}
