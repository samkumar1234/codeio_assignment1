import java.util.*;

public class Arrpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        if(n == 1){
            System.out.println("Array of length 1 is palindrome...");
            System.exit(0);
        }

        int l = 0;
        int r = a.length - 1;
        boolean b = true;

        while(l <= r)
        {
            if(a[l] != a[r]){
                b = false;
                break;
            }

            l++;
            r--;
        }

        if(!b){
            System.out.println("Array is not an palindrome...");
        }else{
            System.out.println("Array is palindrome...");
        }

    }
}