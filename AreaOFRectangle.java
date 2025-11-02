import java.util.Scanner;

class AreaOFRactangld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length rectangle :");
        int L = in.nextInt();
        System.out.print("Enter the berth of rectangle :");
        int B = in.nextInt();
        System.out.println("Area of rectangle :"+(B*L));
    }
}
