import java.util.Scanner;

public class fibonacci2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int a= 0;
        int b=1;
        int count = 0;
        while (n <= count){

            b = a+b;

            count= a+b;

        }
        System.out.println(count);


    }
}
