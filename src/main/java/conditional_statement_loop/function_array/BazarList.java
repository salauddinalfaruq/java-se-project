package conditional_statement_loop.function_array;

import java.util.HashMap;
import java.util.Scanner;

public class BazarList {

    public static  void searchItem(String item){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an item name: ");
        String userInput = sc.next();

        if(item == userInput) {
            System.out.println();
        }
    }

    public static void totalPrice(){

    }

    public static void main(String[] args) {

        HashMap <String, Integer> itemPrice = new HashMap<>();

        itemPrice.put("Rice", 60);
        itemPrice.put("Mutton", 20);
        itemPrice.put("Potato", 800);
        itemPrice.put("Onion", 50);
        itemPrice.put("Chili", 150);
        itemPrice.put("Oil", 200);

        searchItem(String.valueOf(itemPrice));
    }
}
