import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chek your age group");
        System.out.print("Please,enter your age :");
        int age = input.nextInt();

        if (age >= 65) {
            System.out.println("You are the senior citizen");
        } else if (age >=20 ) {
            System.out.println("You are an adult ");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        }else {
            System.out.println("You are a child");
        }
    }
}
