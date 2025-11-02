import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array searching...");
        System.out.print("Enter your number: ");
        int [] array ={23,5,55,4,765,87,8985,687,6,4,2,7,69,30,857,73};
        int num =input.nextInt();

        boolean isFound = isFound(array,num);
        if (isFound ) {
            System.out.println(" your number is found ");

        }else {
            System.out.println("your number is not found");
        }
    }
    public static boolean isFound(int [] array , int num){
        int index =0;
        while (index < array.length){
            if (array[index] == num) {
                return true;

            }
               index++;
        }
        return false;
    }
}
