package Assignment6;

public class Employee {
    int EmpID;
    String Ename;
    int Esal;
    String Job;
    void getEmpData(int i, String n, int s, String j )
    {
        EmpID = i;
        Ename = n;
        Esal = s;
        Job = j;
    }
    void displayEmpData()
    {
        System.out.println(EmpID+" "+Ename+" "+Esal+" "+Job);
    }
}
