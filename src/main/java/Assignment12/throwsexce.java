package Assignment12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throwsexce {
    public static void main(String [] args)throws IOException {
        FileReader FR = new FileReader("C:\\Test.txt");
        BufferedReader bfr = new BufferedReader(FR);
        System.out.println(bfr.readLine());
    }
}
