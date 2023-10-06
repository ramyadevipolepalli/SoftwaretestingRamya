package Assignment6;

import java.text.SimpleDateFormat;

public class Student {
    int SID;
    String Sname;
    int Sub1,Sub2,Sub3;
    void Stu(int i, String n,int s1,int s2,int s3) {
        SID = i;
        Sname = n;
        Sub1 = s1;
        Sub2 = s2;
        Sub3 = s3;
        }
        void getStuData ()
        {
            System.out.println(SID+" "+ Sname);
    }
    void CalTotalMarks()
    {
        System.out.println(Sub1+Sub2+Sub3);
    }
}

