import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Fibonacci Series");
        System.out.print("Enter your number :");
        int num = input.nextInt();
        System.out.println("This is required fibonacci series for number >>>");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");
        int x = 0, y=1;
        while (x+y<=num){
            int z =x+y;
            System.out.print(z+" ");
            x =y;
            y = z;
        }

    }
}
