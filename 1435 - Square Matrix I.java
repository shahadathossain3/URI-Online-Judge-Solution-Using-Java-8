import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,j,k,l,a,b,n;
        for(;;)
        {
            n=input.nextInt();
            if(n==0)
                break;
            int z[][]=new int[n][n];
            k=n/2;
            if(n%2==1)
                k++;
            a=0;
            b=n-1;
            for(l=1; l<=k; l++)
            {
            for(i=a; i<=b; i++)
                {
               for(j=a; j<=b; j++)
                    {
                        z[i][j]=l;
                    }
                }
                a++;
                b--;
            }
            for(i=0; i<n; i++)
            {
           for(j=0; j<n; j++)
                {
                    if(j==0)
                    System.out.printf("%3d",z[i][j]);
                    else
                        System.out.printf("%4d",z[i][j]);
                }
                System.out.printf("\n");
            }
               System.out.printf("\n");
        }
    }
    
}