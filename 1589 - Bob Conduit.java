import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,k,i;
        i=1;
        b=input.nextInt();
        while(i<=b)
        {
            a=input.nextInt();
            c=input.nextInt();
               System.out.print(a+c);
            i++;
            System.out.print("\n");
        }
    }
    
}
