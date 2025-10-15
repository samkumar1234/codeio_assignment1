import java.util.*;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        int pos = in.nextInt();

        if(pos < 0 && pos >= n)
        {
            System.out.println("Invalid Position...");
            System.exit(0);
        }

        for(int i=pos;i < n-1;i++) //shifting
        {
            a[i] = a[i+1];
        }

        int[] b = new int[n-1];
        for(int i=0;i < b.length;i++)
        {
            b[i] = a[i];
        }

        a = b;

        for(int i : a)
        {
            System.out.print(i+" ");
        }

    }
}
