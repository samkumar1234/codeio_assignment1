import java.util.*;

public class treasure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a > b)
        {
            if(a > c)
            {
                System.out.print(a);
            }else{
                System.out.print(c);
            }
        }else{
            if(b > c)
            {
                System.out.print(b);
            }else{
                System.out.print(c);
            }
        }

    }
}