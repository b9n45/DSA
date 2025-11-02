import java.util.Scanner;

public class SumOfAllDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Sum of all digit ");
        System.out.print("Enter your number :");
        int num = input.nextInt();
        int sum = SumDigit(num);
        System.out.println("Sum of all digit is :"+ sum);

    }
    public static int SumDigit(int num){
       int  sum =0;
        while(num > 0){
          sum = sum+num %10;
          num = num /10;

        }
        return sum;
    }
}
