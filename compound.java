import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class compound{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
double A;
double P;
double I;
double N;
System.out.println("enter your principal amount");
     P = scan.nextDouble();
        System.out.println("enter your interst");
        I = scan.nextDouble();
        I = I/100;
        System.out.println("enter your period");
        N = scan.nextDouble();

  A = P * Math.pow(( 1 + I),N);
  


        
        System.out.println("your answer is:" + A);
    }
}