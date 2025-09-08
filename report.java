import java.util.*;

public class report {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n >= 90)
        {
            System.out.print("A");
        }else if(n >= 75 && n < 90)
        {
            System.out.print("B");
        }else if(n >= 50 && n < 75)
        {
            System.out.print("C");
        }else{
            System.out.print("Fail");
        }

    }
}