import java.util.*;

class Student{

    private String name;
    private long id;
    private int marks;

    Student(String name,long id,int marks)
    {
        this.setName(name);
        this.setId(id);
        this.setMarks(marks);
    }

    Student(Student s1)
    {
        setName(s1.name);
        setId(s1.id);
        setMarks(s1.marks);
    }

    void setName(String name)
    {
        this.name = name;
    }

    void setId(long id)
    {
        this.id = id;
    }

    void setMarks(int marks)
    {
        this.marks = marks;
    }

    void disp()
    {
        System.out.println("NAME : "+name);
        System.out.println("ROLL NO : "+id);
        System.out.println("MARKS : "+marks);
    }


}
public class Copy_constructor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        long id = in.nextLong();
        int marks = in.nextInt();
        in.nextLine();

        Student s1 = new Student(name,id,marks);

        Student s2 = new Student(s1);

        s1.disp();
        s2.disp();

        s2.setName("TANJIRO KAMADO");
        s2.setId(111522104456L);
        s2.setMarks(93);

        s1.disp();
        s2.disp();


    }
}
