import java.util.*;
class Student
{
    String name;
    long roll_no;
    int marks;

    void set(Scanner in)
    {
        name = in.nextLine();
        roll_no = in.nextLong();
        marks = in.nextInt();
        in.nextLine();
    }

    void display()
    {
        System.out.println("Name of the Student : "+name);
        System.out.println("Roll Number : "+roll_no);
        System.out.println("Mark of the Student : "+marks);
        System.out.println("=====================================================");
    }
}

public class Stud_record {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student[] a = new Student[3];
        Student s1 = new Student();
        s1.set(in);
        a[0] = s1;

        Student s2 = new Student();
        s2.set(in);
        a[1] = s2;

        Student s3 = new Student();
        s3.set(in);
        a[2] = s3;

        System.out.println("===============STUDENT DETAILS=======================");

        for(Student s : a)
        {
            s.display();
        }


    }
}