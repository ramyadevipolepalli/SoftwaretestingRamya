package Assignment2;

public class Student {
    int Studentid;
    String Studentname;
    char Studentgrade;

    Student(int r,String n, char c){
        Studentid =r;
        Studentname=n;
        Studentgrade=c;

    }
void displayStudentinformation(){
    System.out.println(Studentid+""+Studentname+""+Studentgrade);
}









}
