package classass3;

public class twodarrayprintforeachloop {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        for (int[] i : arr){
            String display = " ";
        for (int j : i) {
            display = display +" "+ String.valueOf(j);
        }
            System.out.println(display);
        }
}}
