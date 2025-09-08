import java.util.*;

public class bank_balance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int balance = in.nextInt();

        if(balance > 0)
        {
            System.out.print("Positive Balance");
        }else if(balance == 0)
        {
            System.out.print("Zero Balance");
        }else{
            System.out.print("OverDraft");
        }

    }
}