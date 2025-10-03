import java.util.*;

class Employee{
    int bonus;

    Employee(int bonus)
    {
        this.bonus = bonus;
    }

    int getBonus()
    {
        return bonus;
    }

}

class Manager extends Employee{


    Manager(int bonus)
    {
        super(bonus);
    }

    int getBonus()
    {
        return bonus;
    }

}

class Developer extends Employee{
    Developer(int bonus)
    {
        super(bonus);
    }

    int getBonus()
    {
        return bonus;
    }
}


public class week4_nine {
    public static void main(String[] args) {

        int n = 12000;
        
        Employee e = new Manager(n);

        //Developer d = new Employee(12345); error


        System.out.println(e.getBonus());
        //System.out.println(d.getBonus());

        Employee d = new Developer(12345);
        System.out.println(d.getBonus());

    }
}
