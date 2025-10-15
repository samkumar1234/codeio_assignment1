
public class Main {
    public static int[] count(int[] a,int n)
    {
        int[] res = new int[2];
        for(int i=0;i<n;i++)
        {
            if(a[i] > 0)
            {
                res[0]++;
            }else{
                res[1]++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        
        int[] a = {2,3,-1,-3,-4,56,12,-90,23,33};

        int len = a.length;

        for(int i=0;i<len;i++)
        {
            if(a[i] == 0){
                System.out.println("Only positive and negative numbers");
                System.exit(0);
            }
        }

        int[] c = count(a,len);

        int m = c[0];
        int n = c[1];

        int s=0,j=m-1;
        int ctr = 0;

        while(ctr < a.length)
        {
            int num = a[ctr];
            if(num > 0)
            {
                a[s++] = num;
            }else{
                a[j++] = num;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }



    }
}
