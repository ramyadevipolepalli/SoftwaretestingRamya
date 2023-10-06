package Assignment5;

import java.util.Arrays;

public class String8ques {
    public static void main(String[] args) {
        String s = "Welcome to selenium java training";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {

            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }

        }
        System.out.println("Number of words" + count);
        String[] words = s.split("\\s");
        for (String w : words) {
            System.out.println(w.toUpperCase());

        }

}
}
