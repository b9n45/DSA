import java.util.Scanner;

public class ArrayAvarage {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate Sum & Avarage of Array");
        int[] numsArray = ArrayUtility.inputArray();
        long sum = sum(numsArray);
        double Avarage = Avarage(numsArray);
        System.out.println("Sum of your Array is : " +sum);
        System.out.println("Avarage of Array is : " +Avarage);
    }

    public static long sum (int [] numArray) {
     long sum = 0;
     int i=0;
     while(i < numArray.length){
         sum += numArray[i];

         i++;
     }

        return sum ;
    }
    public static double Avarage(int [] numArray){
       double sum = sum(numArray);


        return (sum/numArray.length);
    }
}
