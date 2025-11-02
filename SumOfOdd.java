import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of all odd number up to N ");
        System.out.print("Enter your number :");
        int N = input.nextInt();
        int sum = OddSum(N);
        System.out.println("Odd till "+ N + " is :"+ sum);
    }
public static int  OddSum(int N){
       int sum =0;
        int i=1;
        while(i<=N){
            sum+=i;
            i+=2;
        }
return sum;
    }}

