package Assignment5;

public class ques8cont {
    public static void main(String[] args) {
        String s = "Welcome to selenium java training";
        String slower = s.toLowerCase();
        System.out.println(slower);
        System.out.println(slower.contains("selenium"));
        String words[] = s.split("\\s");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }
        System.out.println("Reversed String:" + reversedString);
    }
}