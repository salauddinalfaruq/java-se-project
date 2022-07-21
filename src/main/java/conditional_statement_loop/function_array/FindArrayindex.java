package conditional_statement_loop.function_array;

import java.util.Scanner;

public class FindArrayindex {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,2,4,6,8};
        int index = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input an integer number: ");
        int input = sc.nextInt();

        for (int i = 0; i < numbers.length; i++){

            if(numbers[i] == input){
                index = i;
                System.out.println("Number is found in position: " + index);
                break;
            }
            else {
                System.out.println("Number is not found");
            }
        }
    }
}
