import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float a[][]=new float [12][12];
        float k=0,p=0;
        String ch;
        ch=input.next();
       int i,l=0,j;
       for(i=0; i<12; i++)
       {
           for(j=0; j<12; j++)
           {
               a[i][j]=input.nextFloat();
               if(j<=10-i)
               {
                   k+=a[i][j];
                   l++;
               }
           }
       }
       if(ch.equals("S"))
       {
           System.out.printf("%.1f",k);
       }
       if(ch.equals("M"))
       {
           p=k/l;
           System.out.printf("%.1f\n",p);
       }
    }
    
}

