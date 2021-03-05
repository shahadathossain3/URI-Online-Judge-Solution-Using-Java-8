import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
 
        int a,i,b;
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            a=input.nextInt();
            i=0;
            int c=0;
            while(i<a)
            {
                b=input.nextInt();
                if(b>c)
                {
                    c=b;
                }
                i++;
            }
            if(c<10)
            {
                System.out.println(1);
            }
            else if(c<20)
            {
                System.out.println(2);
            }
            else
            {
                System.out.println(3);
            }
            }
        }
}