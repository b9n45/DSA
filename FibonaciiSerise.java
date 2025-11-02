import java.util.Scanner;

public class FibonaciiSerise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
        while (count<= n){
            int tamp = b ;
            b = a + b;
            a = tamp;
            count++;
        }
        System.out.println(b);
    }
}
