import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius : ");
        int r = in.nextInt();

        double volume = (4.0/3.0)*Math.PI*Math.pow(r,3);
        System.out.println("volume of Sphere :"+volume);
    }
}
