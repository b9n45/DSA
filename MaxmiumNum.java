import java.util.Scanner;

public class MaxmiumNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your three number : ");
         int a = in.nextInt();
         int b =in.nextInt();
         int c = in.nextInt();

        if ( a>b && a>c) {
            System.out.println(a);

        }
        else if (b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
