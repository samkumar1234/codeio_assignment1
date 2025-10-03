import java.util.*;
class Point{
    private int x;
    private int y;

    Point(int x,int y)
    {
        set_X(x);
        set_Y(y);
    }

    Point(Point p)
    {
        set_X(p.x);
        set_Y(p.y);
    }

    void set_X(int x)
    {
        this.x = x;
    }

    void set_Y(int y)
    {
        this.y = y;
    }

    void position()
    {
        System.out.println("The Coordinates of the Position are : ("+x+","+y+")");
    }
}

public class Point_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Point p1 = new Point(2,4);

        Point[] N_Points = new Point[n];

        for(int i=0;i<n;i++)
        {
            N_Points[i] = new Point(p1);
        }

        p1.position();

        for(Point p : N_Points)
        {
            p.set_X(in.nextInt());
            p.set_Y(in.nextInt());
            p.position();
        } 

    }
}
