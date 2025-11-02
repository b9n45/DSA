import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate factorial");
        System.out.print("Enter your number :");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of "+num+" is :"+ fact);
    }
public static long factorial(int num ){
        if(2>num){
            return 1;
}
        long fact =1;
        int i = 2;
        while (i<=num){
            fact *=i;
            i++;
        }
    return fact;

}}

