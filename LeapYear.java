import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter year their will you chek : ");
        int Y = in.nextInt();

        if ((Y%2 ==400)||(Y%4 == 0 && Y%100!=0) ) {
            System.out.println("Year is Leap");

        }else {
            System.out.println("year is not leap");
        }
    }
}
