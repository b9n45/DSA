import java.util.Scanner;



public class ParimeterOfRactriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the parimeter of Ractangle");
        System.out.print("please Enter the Long side of Ractangle : ");
        int A_or_C = input.nextInt();
        System.out.print("please Enetr the small side of ractangle :");
        int B_or_D = input.nextInt();


        int parimter =(2*(A_or_C)+2*(B_or_D));
        System.out.println("parimrter of Ractangle is : "+parimter);

    }

}
