import java.util.*;

public class fast_runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Arjun = in.nextInt();
        int Varun = in.nextInt();

        if(Varun > Arjun)
        {
            System.out.print("Arjun");
        }else if(Arjun > Varun)
        {
            System.out.print("Varun");
        }else{
            System.out.print("Tie");
        }

    }
}