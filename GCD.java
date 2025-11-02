import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Gratest Common Factor ... ");
        System.out.print("Enter your first no. :");
        int x = input.nextInt();
        System.out.print("Enter your second no. : ");
        int y = input.nextInt();
        int gcd = gcd(x,y);
        System.out.println("GCD of the number is :" + gcd);

    }
    public static int gcd (int x , int y ) {
        int gcd = 1;
        int i = 2;
        int least = least(x,y);
        while (i<=least){
            if (x%i==0 && y%i==0){
                i=gcd;
            }
            i++;
        }
        return gcd;
    }
    public static int least (int num1 , int num2 ){
        if (num1 > num2 ){
            return num2;
        }else {
            return num1;
        }

    }
}

