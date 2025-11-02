import java.util.Scanner;

public class AreaOfTriAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of tringle :");
        double L = in.nextDouble();
        System.out.print("Enter breth of tringle :");

        double B = in.nextDouble();
        System.out.println("Area of Triangle is :"+(0.5*L*B));

    }
}
