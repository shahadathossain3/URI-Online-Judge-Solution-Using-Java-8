import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,i,j,k,l;
              while(input.hasNext())
              {
               n=input.nextInt();
      i=0;
      m=n-1;
      int a[][]=new int[n][n];
      while(i<n)
      {
          j=0;
          while(j<n)
          {
              a[i][j]=3;
              if(i==j)
              {
                 a[i][j]=1; 
              }
              if(j==m)
              {
                  a[i][j]=2;
              }
              j++;
          }
          m--;
          i++;
      }
      k=0;
      while(k<n)
      {
          l=0;
          while(l<n)
          {
              System.out.printf("%d",a[k][l]);
              l++;
          }
          System.out.printf("\n");
          k++;
      }
              }
          
      }
    }
    
