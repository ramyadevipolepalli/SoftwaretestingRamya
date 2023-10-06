package Assignment7;

public class Calculation {
    int a,b,c;
    Calculation(int i, int j,int k){
        a = i;
        b = j;
        c = k;

    }
    void Sum(){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Calculation a1 = new Calculation(67,73,67);
        a1.Sum();
    }


}
