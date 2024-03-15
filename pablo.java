import java.util.Scanner;

public class pablo{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        System.out.println("enter your first number");
        num1 = scan.nextInt();
        System.out.println("enter your second number");
        num2 = scan.nextInt();

        num3 = num1 - num2;
        System.out.println("your answer is:" + num3);

        


    }
}