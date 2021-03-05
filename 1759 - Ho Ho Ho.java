import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,k,i;
        i=1;
        b=input.nextInt();
        while(i<=b)
        {
            if(i<b)
            {
               System.out.print("Ho ");
            }
               if(i==b)
                   System.out.print("Ho!\n");
            i++;
        }
    }
    
}
