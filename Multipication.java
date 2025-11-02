import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an number :");
        int n = in.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(n+"X"+i+" 4= "+i*n );
            i++;
        }


    }
}
