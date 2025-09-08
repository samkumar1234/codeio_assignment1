import java.util.*;

public class even_odd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n < 0){
            System.out.print("Invalid input");
            System.exit(0);
        }

        boolean res = (n & 1) == 1;

        if(res)
        {
            System.out.print("OFF");
        }else{
            System.out.print("ON");
        }

    }
}