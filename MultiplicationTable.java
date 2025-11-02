import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multipication table... ");
        System.out.println("Enter the number :");
         int num = input.nextInt();
        printMultipication(num);

    }
    public static void printMultipication(int num){
     int i =1 ;
     while (i<=10){
         System.out.println(num+"X"+i+"="+ (i*num));
       i++;
     }

    }
}
