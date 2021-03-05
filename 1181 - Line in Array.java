import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a[][]=new float[12][12];
        float k=0,c=0;
        int b,i=0,j=0;
        b=input.nextInt();
        String ch=input.next();
       // b=input.nextInt();
        
        for(i=0; i<12; i++)
        {
            for(j=0; j<12; j++)
            {
                a[i][j]=input.nextFloat();
                if(i==b)
                {
                   c+=a[i][j]; 
                }
            }
        }
        
            
        if(ch.equals("S"))
        {
            System.out.println(c);
        }
        else if(ch.equals("M"))
        {
            k=c/12;
            System.out.println(k);
        }
    }
    
}
