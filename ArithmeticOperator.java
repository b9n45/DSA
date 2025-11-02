import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("<<< Welcome to calculator >>>");
        System.out.print(" Enter the first number : ");
        int X = input.nextInt();
        System.out.print("Enter the second number :");
        int Y = input.nextInt();


        int add = X+Y;
        int sub = X-Y;
        int multiplication =X*Y;
        int divide =X/Y;
         int modulo = X%Y;
        System.out.println("\n");
        System.out.println("Addition of X + Y :"+ add);
        System.out.println("Subtraction of X - Y  :"+sub);
        System.out.println("Multiplication of X * Y :"+ multiplication);
        System.out.println("Division of X/Y :" +divide);
        System.out.println("Modulo of X%Y :"+modulo);

    }


}
