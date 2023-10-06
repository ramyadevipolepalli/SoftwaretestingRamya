package Assignment6;

public class Employeeobject {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.getEmpData(1234,"Ramya",120000,"Quality Engineer");
        emp2.getEmpData(2345,"Manvi",132000,"Scrum Master");
        emp1.displayEmpData();
        emp2.displayEmpData();
    }
}
