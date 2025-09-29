import java.util.*;

class Shape{

    void area()
    {
        System.out.println("Base class Shape which will be overridden by derieved classes");
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    void area()
    {
        System.out.printf("Area of circle with radius %.2f is %.2f%n", radius, (3.14*radius*radius));
    }
}

class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }

    void area()
    {
        System.out.println("Area of the Triangle with base "+base+" and height "+height+" is "+(0.5*base*height));
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void area()
    {
        System.out.println("Area of the Rectangle with dimensions "+length+"X"+breadth+" is "+(length * breadth));
    }
}

public class Shape_area {
    public static void main(String[] args) {
        
        int n = 3;
        Shape[] s = new Shape[n];

        s[0] = new Circle(1.2);
        s[1] = new Triangle(12.0,30.0);
        s[2] = new Rectangle(4,5);

        for(Shape i : s)
        {
            i.area();
        }

    }
}
