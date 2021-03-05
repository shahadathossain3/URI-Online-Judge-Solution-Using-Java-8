import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b,c,k,n,i,j,s,p,q;
        while(input.hasNext())
        {
            n=input.nextInt();
            i=0;
            int a[][]=new int[n][n];
            b=n/3;
            while(i<n)
            {
                j=0;
                a[i][j]=0;
                a[i][i]=2;
                i++;
                j++;
            }
            //j=0;
           k=n-1;
           j=k;
           i=0;
            while(i<n)
            {
                a[i][j]=3;
                i++;
                j--;
            }
            i=b;
            while(i<n-b)
            {
                j=b;
                while(j<n-b)
                {
                    a[i][j]=1;
                    j++;
                }
                i++;
            }
            s=n/2;
            a[s][s]=4;
            p=0;
            while(p<n)
            {
                q=0;
                while(q<n)
                {
                  System.out.print(a[p][q]);
                  q++;
                }
                p++;
                System.out.print("\n");
            }
            System.out.println();
         }
    }
    
}
