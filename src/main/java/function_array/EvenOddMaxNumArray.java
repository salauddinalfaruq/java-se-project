package function_array;

import java.util.Scanner;

public class EvenOddMaxNumArray {
    public static void main(String[] args) {

        int num = 5;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[num];

        System.out.println("Enter 5 element in array:");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe number is even: ");
        for (int i = 0; i < num; i++ ){
            if(arr[i] % 2 == 0){
                evenCount++;
                System.out.println(arr[i] + "");
            }
        }
        System.out.println("Number of even: " + evenCount);

        System.out.println("\nOdd numbers: ");
        for (int i = 0; i < num; i++ ){
            if(arr[i] % 2 != 0){
                oddCount++;
                System.out.println(arr[i]+ "");
            }
        }
        System.out.println("Number of odd: " + oddCount);

        for(int i = 0; i < num; i++){
            sum += arr[i];
        }

        double avg = sum / num;
        System.out.println("\nAverage of array: " + avg);
    }
}
