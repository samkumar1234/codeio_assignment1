import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y = in.nextInt();

        if((y % 4 == 0 && !(y % 100 == 0)) || (y % 400 == 0))
        {
            System.out.print("Leap Year");
        }else{
            System.out.print("Not a Leap Year");
        }

    }
}