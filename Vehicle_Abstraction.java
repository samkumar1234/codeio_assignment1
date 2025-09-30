abstract class Vehicle{

    String Vehicle_name;

    Vehicle(String Vehicle_name)
    {
        this.Vehicle_name = Vehicle_name;
    }

    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle
{
    Car(String Vehicle_name)
    {
        super(Vehicle_name);
    }

    public void start(){
        System.out.println(Vehicle_name+" starts roaring in the track!!!");
    }
    public void stop(){
        System.out.println(Vehicle_name+" stops at the CheckPoint!!!");
    }
}

class Bike extends Vehicle
{

    Bike(String Vehicle_name)
    {
        super(Vehicle_name);
    }

    public void start(){
        System.out.println(Vehicle_name+" starts the explore the tracks");
    }
    public void stop(){
        System.out.println(Vehicle_name+" Stops with a style");
    }
}

public class Vehicle_Abstraction {
    public static void main(String[] args) {
        System.out.println("Demonstration of Abstraction");


        Car c1 = new Car("Ferrari");
        c1.start();
        c1.stop();

        Bike b1 = new Bike("Apache");
        b1.start();
        b1.stop();

    }
}