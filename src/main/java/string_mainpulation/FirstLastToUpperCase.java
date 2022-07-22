package string_mainpulation;

public class FirstLastToUpperCase {
    public static void main(String[] args) {

        String str = "chattogram";

        String str1 = String.valueOf(str.charAt(0)).toUpperCase();
        int len = str.length()-2;
        String str2 = String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        System.out.println(str1+len+str2);
    }
}


