import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int i,j,n,p,w,v,s,t,q;
       while(true)
       {
           i=0;
           n=input.nextInt();
           if(n==0)
               break;
           int a[][]=new int[n][n];
           while(i<n)
           {
               p=1;
               j=0;
               t=0;
               s=i+1;
              while(j<n)
              {
                  if(i==j)
                  {
                      a[i][j]=1;
                  }
                  if(i<j)
                  {
                      p++;
                      a[i][j]=p;
                  }
                  if(i>j)
                  {
                     q=s-t;
                     a[i][j]=q;
                     t++;
                  }
                  j++;
              }
              i++;
           }
   w=0;
           while(w<n)
           {
               v=0;
               while(v<n)
               {
                   if(v==0)
                   System.out.printf("%3d",a[w][v]);
               else
               System.out.printf("%4d",a[w][v]);
                   v++;
               }
               w++;
               System.out.printf("\n");
           }
           System.out.printf("\n");
       }
    }
    
}