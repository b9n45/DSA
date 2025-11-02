import java.util.Scanner;

public class parimeterOfQudrilateral {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Calculate the parimeter of Quadrilatral");
        System.out.println("Enter all four side in cms :");
        double  a = input.nextDouble();
        double  b = input.nextDouble();
        double  c = input.nextDouble();
        double  d = input.nextDouble();

        System.out.println("\n");
        double parimeter = a+b+c+d;
        System.out.println("parimetr of Quadrilater is : "+ parimeter);
    }
}
