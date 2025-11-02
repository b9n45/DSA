import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to convert Feherniate to Celsius ");
        System.out.println(" Please enter the value of Degree in F :");
        float F = input.nextFloat();

        System.out.println("\n");
        float Celsius = (F-32)*(5/9);
        System.out.println("Degree in celsius is :"+ Celsius);
    }
}
