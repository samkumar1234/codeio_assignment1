import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Combination_sum {

    public static ArrayList<String> sum_eq_k(int[] a,int target)
    {

        Set<Integer> seen = new HashSet<>();
        Set<String> pair = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for(int n : a)
        {
            int c = target - n;

            if(seen.contains(c))
            {

                int small = Math.min(n,c);
                int large = Math.max(n,c);

                String p = "["+small+","+large+"]";

                if(!pair.contains(p))
                {
                    ans.add(p);
                    pair.add(p);
                }
            }

            seen.add(n);

        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();

        ArrayList<String> res = sum_eq_k(a,target);

        for(String s : res)
        {
            System.out.println(s);
        }

    }
}
