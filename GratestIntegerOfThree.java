import java.util.Scanner;

public class GratestIntegerOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to chek the gratest integer among three number");
        System.out.print("Please enter the numbers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1>=num3) {
            System.out.println( num1 + " is grater number");

        } else if (num2 >= num3) {
            System.out.println(num2 +"is grater number");

        }
        else {
            System.out.println(num3 +"is grater number");
        }

    }

    }

