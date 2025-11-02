import java.util.Scanner;

public class ClassGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to calculate your grade...");
        System.out.print("Please enter your percentage :  ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("Your grade is A ");

        } else if (percentage>= 75) {
            System.out.println("Your grade is B ");
            
        } else if (percentage >= 60) {
            System.out.println("Your grade is C ");
            
        } else if (percentage >= 35) {
            System.out.println("Your grade is D ");
            
        }
        else {
            System.out.println("You are fail in exam ");
        }
    }
}
