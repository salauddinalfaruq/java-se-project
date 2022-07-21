package conditional_statement_loop;

import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        int marks;
        String grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input integer marks between 0 to 100 and see your grade");
        marks = sc.nextInt();

        if (marks >= 80 && marks <= 100) {
            grade = "A+";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 70 && marks <= 79) {
            grade = "A";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 60 && marks <= 69) {
            grade = "A-";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 50 && marks <= 59) {
            grade = "B";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 40 && marks <= 49) {
            grade = "C";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 33 && marks <= 39) {
            grade = "D";
            System.out.println("Your grade is: " + grade);
        } else if (marks >= 0 && marks <= 32) {
            grade = "F";
            System.out.println("Your grade is: " + grade);
        }

    }
}
