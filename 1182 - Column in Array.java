import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a[][]=new float[12][12];
        float k=0,c=0;
        int b;
        b=input.nextInt();
        String ch=input.next();
       // b=input.nextInt();
        
        for(int i=0; i<12; i++)
        {
            for(int j=0; j<12; j++)
            {
                a[i][j]=input.nextFloat();
                if(j==b)
                {
                   c+=a[i][j]; 
                }
            }
        }
        
          k=c/12;  
        if(ch.equals("S"))
        {
            System.out.printf("%.1f\n",c);
        }
        else if(ch.equals("M"))
        {
            System.out.printf("%.1f\n",k);
        }
    }
    
}

