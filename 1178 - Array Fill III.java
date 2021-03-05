import java.util.Scanner;
public class Main {
    //private static DecimalFormat n[i] = new DecimalFormat(".##");

    public static void main(String[] args) {
     //int [] n=new int [100];
    double b;
     int i;
     Scanner input= new Scanner(System.in);
     double n[]=new double[100];
    // float b;
     b=input.nextDouble();
     i=0;
     while(i<100)
     {
      n[i]=b;
      System.out.print("N["+i+"] = ");
      System.out.printf("%.4f\n",n[i]);
      //System.out.println("%.4f\n",n[i]);
      b/=2;
      i++;
     }
    }
    
}
