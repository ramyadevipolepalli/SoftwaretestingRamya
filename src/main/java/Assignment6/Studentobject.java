package Assignment6;

public class Studentobject {
    public static void main(String[] args){
       Student stu1 = new Student();
       Student stu2 = new Student();
       stu1.Stu(111,"Ramya",99,100,98);
       stu2.Stu(112,"Manvi",89,88,98);
       stu1.getStuData();
       stu1.CalTotalMarks();
       stu2.getStuData();
       stu2.CalTotalMarks();

    }
}
