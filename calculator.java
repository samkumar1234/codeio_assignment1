import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int ch = in.nextInt();

        if(ch == 1)
        {
            System.out.print(a+b);
        }else if(ch == 2)
        {
            System.out.print(a-b);
        }else if(ch == 3){
            System.out.print(a*b);
        }else if(ch == 4){
            if(b == 0){
                System.out.print("Cannot divide by zero");
                System.exit(0);
            }else{
                System.out.print(a/b);
            }
        }else{
            System.out.print(-1);
        }

    }
}