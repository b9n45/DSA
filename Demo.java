import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

//        int. float,
//        boolean, char, string

//        array

        int rollno= 10;
        System.out.println(rollno);

        String name= "manish";
        System.out.println(name);

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for (int i= 0; i < n; i++){
            for (int j= 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
