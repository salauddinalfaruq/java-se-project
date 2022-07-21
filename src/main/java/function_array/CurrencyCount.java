package function_array;

import java.util.Scanner;

public class CurrencyCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        int amount = sc.nextInt();

        int[] notes = {1000,500,100,50,20,10,5,2,1};
        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++){

            if(amount >= notes[i]){

                noteCount[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        for(int i = 0; i < notes.length; i++){

            if(noteCount[i] != 0){
                System.out.println("Number of " + notes[i] + " notes: " + noteCount[i]);
            }
        }
    }
}
