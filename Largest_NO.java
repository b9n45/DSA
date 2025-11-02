import java.util.Scanner;

public class Largest_NO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two number to chek :");
         int a = in.nextInt();
         int b = in.nextInt();

         if(a>b){
             System.out.println(a+" is Grater number b/n both ");
         } else {
             System.out.println(b+" is Grater number b/n both ");
         }
    }
}
