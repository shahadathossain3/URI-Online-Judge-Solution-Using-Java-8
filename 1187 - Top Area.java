import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a[][]=new double [12][12];
        double k=0,p=0;
        int i,j,x,g=10,y,l=0,t=1;
        String ch;
        ch=input.next();
        for(i=0; i<12; i++)
        {
            for(j=0; j<12; j++)
            {
                a[i][j]=input.nextDouble(); 
            }
        }
        for(x=0; x<5; x++)
        {
            for(y=t; y<=g; y++)
            {
                k+=a[x][y];
                l++;
            }
            g--;
            t++;
        }
        if(ch.equals("S"))
        {
            System.out.printf("%.1f\n",k);
        }
        if(ch.equals("M"))
        {
            p=k/l;
            System.out.printf("%.1f\n",p);
        }
    }
    
}

