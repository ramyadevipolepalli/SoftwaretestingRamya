package Assignment12;

public class Stringsexception {
    public static void main(String[] args){
        String s = "abc";
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }catch (NumberFormatException me){
            System.out.println(me);
        }
        finally {
            System.out.println("execute code");
        }



    }
}
