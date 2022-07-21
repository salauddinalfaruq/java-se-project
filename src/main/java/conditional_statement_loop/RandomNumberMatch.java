package conditional_statement_loop;

import java.util.Scanner;

public class RandomNumberMatch {
    public static void main(String[] args) {

        int min = 1, max = 100;
        int min1 = 101, max1 =200;

        Scanner sc = new Scanner(System.in);
        int point =0;

        for(int i = 0; i<= 10; i++){
            int firstNumber = (int) ((Math.random()*(max-min)+min));
            int secondNumber = (int) ((Math.random()*(max1-min1)+min1));

            System.out.println("First random number is"+ firstNumber);
            System.out.println("Second random number is"+ secondNumber);
            System.out.println("Please enter an integer number");
            int num = sc.nextInt();

            if(num == firstNumber || num == secondNumber){
                point = 1;
                point = point + i;
            }
        }
        System.out.println("Total point is:"+ point);
    }
}
