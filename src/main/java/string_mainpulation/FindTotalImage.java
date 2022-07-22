package string_mainpulation;

import java.util.Arrays;

public class FindTotalImage {
    public static void main(String[] args) {
        String[] image = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf",
                "msoffice.exe", "photo3.jpg"};

        String[] str = new String[0];
        for (int i = 0; i < image.length; i++) {
            System.out.println(image[i]);
            str = image[i].split(",");
            }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        //    String str1 = str.split("/.");
        }
    }
}
