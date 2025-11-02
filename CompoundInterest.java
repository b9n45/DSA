import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculater the Simple intrast");
        System.out.print("Enter the value of P :");
        double P = input.nextDouble();
        System.out.print("Enter the value of T :");
        double t = input.nextDouble();
        System.out.print("Enter the value of R :");
        double R = input.nextDouble();

        double CompoundInterest = P*Math.pow((1+R/100),t);
        System.out.println("\n");
        System.out.println("Compound Interest is : " +CompoundInterest);

    }
}
