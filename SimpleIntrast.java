import java.util.Scanner;

public class SimpleIntrast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Calculater the Simple intrast");
        System.out.print("Enter the value of P :");
        double P = input.nextDouble();
        System.out.print("Enter the value of T :");
        double T = input.nextDouble();
        System.out.print("Enter the value of R :");
        double R = input.nextDouble();

        double SimpleInterest =(P*T*R)/100;
        System.out.println("\n");
        System.out.println("Simple interest is : "+SimpleInterest);

    }
}
