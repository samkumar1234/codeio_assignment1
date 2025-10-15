import java.util.*;
import java.util.HashMap;
public class ElementCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int num = a[i];

            if(m.containsKey(num))
            {
                m.put(num,m.get(num)+1);
            }else{
                m.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> i : m.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }

    }
}