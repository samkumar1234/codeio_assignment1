import java.util.*;

class Rectangle{
    int length;
    int breadth;

    void set(Scanner in)
    {
        length = in.nextInt();
        breadth = in.nextInt();
    }

    int getArea()
    {
        return length * breadth;
    }

    int getPerimeter()
    {
        return 2 * (length + breadth);
    }
}


public class Rect_class {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        r1.set(in);
        System.out.println("Area of the Rectangle : "+r1.getArea());
        System.out.println("Perimeter of the Rectangle : "+r1.getPerimeter());

        Rectangle r2 = new Rectangle();
        r2.set(in);
        System.out.println("Area of the Rectangle : "+r2.getArea());
        System.out.println("Perimeter of the Rectangle : "+r2.getPerimeter());



    }
}