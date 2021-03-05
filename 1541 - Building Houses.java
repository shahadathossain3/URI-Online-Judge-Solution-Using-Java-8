import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int i,j,a,b,c,l;
       while(true)
       {
           double k;
            a=input.nextInt();
            if(a==0)
            {
                break;
            }
            b=input.nextInt();
            c=input.nextInt();
            k=a*b*100/c;
            l=(int)Math.sqrt(k);
           System.out.println(l);
       }
    }
    
}
