import java.util.*;

class Person {
    String name;
    int age;

    void disp() {
        System.out.println("Person class with parameters like name and age");
    }
}

class Student extends Person {
    int marks;
    char grade;

    void Stud_details() {
        System.out.println("Name of the Student : " + name);
        System.out.println("Age of the Student : " + age);
        System.out.println("Marks Obtained : " + marks);
        System.out.println("Grade : " + grade);
    }
}

class GraduateStudent extends Student {
    String rsch_topic;

    GraduateStudent(Scanner in) {
        in.nextLine();
        System.out.print("Enter the Name: ");
        name = in.nextLine();

        System.out.print("Enter the Age: ");
        age = in.nextInt();

        System.out.print("Enter the Marks: ");
        marks = in.nextInt();

        in.nextLine();
        System.out.print("Enter the Grade: ");
        grade = in.nextLine().charAt(0);

        System.out.print("Enter the Research Topic: ");
        rsch_topic = in.nextLine();
    }

    String final_yr_project() {
        return rsch_topic;
    }

    void disp_graduate() {
        Stud_details();
        System.out.println("Final year report of " + name + " is " + rsch_topic);
        System.out.println("==========================================================");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        GraduateStudent[] g = new GraduateStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            g[i] = new GraduateStudent(in);
        }

        System.out.println("\n-----------------------------STUDENT DETAILS----------------------------------");
        for (GraduateStudent stud : g) {
            stud.disp_graduate();
        }
    }
}
