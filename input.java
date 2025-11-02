import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome to KG coding "+ name);
    }
}
