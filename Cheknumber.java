import java.util.Scanner;

public class Cheknumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to chek number +ve,-ve , zero ");

        System.out.print("please enter the number : ");
        int X= input.nextInt();

        if (X == 0) {
            System.out.println("Number is zero :"+X);

        } else if (X > 0) {
            System.out.println("Number is Positive :"+X);
        }else {
            System.out.println("Number is Negative :"+X);
        }

    }


}
