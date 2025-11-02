import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to chek odd or even :");
        int num = in.nextInt();
        if (num %2 == 0) {
            System.out.println("Number is EVEN ");

        }else {
            System.out.println("Number is ODD");
        }
    }
}
