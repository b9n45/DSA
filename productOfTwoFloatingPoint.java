import java.util.Scanner;

public class productOfTwoFloatingPoint {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate product of two floating point value ");
        System.out.print("Please enter value of first number : ");
        float X = input.nextFloat();
        System.out.print("please enter value of second number :");
        float Y = input.nextFloat();


        float product = X*Y;
        System.out.println("\n");
        System.out.println("Product of two floating point value is :"+product);
    }
}
