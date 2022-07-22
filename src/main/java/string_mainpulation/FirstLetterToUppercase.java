package string_mainpulation;

import com.sun.org.apache.xpath.internal.objects.XString;

public class FirstLetterToUppercase {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String[] words = str.split(" ");


        for(int i = 0; i< words.length; i++){
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String otherLetter = words[i].substring(1);
            System.out.println(firstLetter + otherLetter);
        }
    }
}
