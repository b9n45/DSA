import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r;
        double PI=3.14;
        System.out.println("Enter the radius of circle in meter : ");
        r = in.nextInt();
        System.out.println("Area of circle is : "+(PI*(r*r)));


    }
}
