import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a[][]=new double [12][12];
        double k=0,kkk=0,kk=0,p=0;
        int i,j,x,y,l=0,ll=0,t=1,lll=0,g=0;
        String ch;
        ch=input.next();
        for(i=0; i<12; i++)
        {
            for(j=0; j<12; j++)
            {
                a[i][j]=input.nextDouble(); 
            }
        }
        for(x=1; x<11; x++)
        {
            if(x>=1&&x<=5)
            {
            for(y=0; y<x; y++)
            {
                k+=a[x][y];
                l++;
            }
            }
            if(x>=6&&x<=10)
            {
                for(y=4-g; y>=0; y--)
                {
                    kk+=a[x][y];
                    ll++;
                }
                g++;
            }
        }
        kkk=k+kk;
        lll=ll+l;
        if(ch.equals("S"))
        {
            System.out.printf("%.1f\n",kkk);
        }
        if(ch.equals("M"))
        {
            p=kkk/lll;
            System.out.printf("%.1f\n",p);
        }
    }
    
}

