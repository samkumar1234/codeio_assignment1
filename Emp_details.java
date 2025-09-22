class Employee{
    private String name;
    private long id;
    private int salary;

    void set(String n,long i,int sal)
    {
        name = n;
        id = i;
        salary = sal;
    }

    String get()
    {
        return name + "\n" + id + "\n" + salary;
    }
}

public class Emp_details {
    public static void main(String[] args) {
        
        Employee e = new Employee();

        e.set("SAM KUMAR.V",22104133,45000);

        System.out.print(e.get());

    }
}