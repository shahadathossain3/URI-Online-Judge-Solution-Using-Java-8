import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k,b,pos,j,p,i = 0;
        //
        p=0;
        j=i+1;
        k=input.nextInt();
     int n[]=new int [k];
     for(i=0; i<k; i++)
     {
         b=input.nextInt();
        n[i]= b;
     }
       // System.out.println(n[i]);
       for(i=0; i<k; i++)
       {
           if(n[i]<n[j])
           {
               p=n[i];
               //pos=indexOf(p);
               pos=i;
               System.out.println("Menor valor: "+p);
               System.out.println("Posicao: "+pos);
           }
       }
       //System.out.prinln(p);
    }
    
}
