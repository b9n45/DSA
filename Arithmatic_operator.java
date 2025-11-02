import java.util.Scanner;

public class Arithmatic_operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the Arithmatic operation which you want to perform : ");
        char op = in.next().charAt(0);

        if (op == '+'){
            System.out.println("Your result is >> " + (a+b));
        } else if (op == '-'){
            System.out.println("Your result is >> " + (a-b));
        } else if (op == '*'){
            System.out.println("Your result is >> " + (a*b));
        } else if (op == '/'){
            System.out.println("Your result is >> " + (a/b));
        } else if (op == '%'){
            System.out.println("Your result is >> " + (a%b));
        } else {
            System.out.println("You Enter the invalid Operation");
        }
    }}
