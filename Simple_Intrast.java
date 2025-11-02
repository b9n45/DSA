import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Intrast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal amount :");
        double P =in.nextDouble();
        System.out.print("Enter of rate :");
        double R = in.nextDouble();
        System.out.print("Enter the time :");
        double T = in.nextDouble();

        System.out.println("Your intrast is "+ ((P*T*R)/100));

    }
}
