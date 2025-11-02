import java.util.Scanner;

public class ReversTheDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse digit ...");
        System.out.print("Please Enter your number :");
        int num = input.nextInt();
        int revers = revers(num);
        System.out.println("Revers number is "+revers);


    }
    public static int revers (int num){
        int newnum = 0;
        while(num>0){
            int digit = num%10;
            newnum = newnum*10+digit;
            num = num /10;
        }return newnum;
    }
}
