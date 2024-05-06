import java.util.Scanner;

public class Task_one {
    public static double vol(double radius) {
        double pi = 3.1415;
        System.out.println("Double called");
        return (4 * pi * Math.pow(radius, 3)) / 3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the sphere : ");
        double radius = scanner.nextDouble();

        System.out.println("The volume is " + vol(radius) + " m^3");

        scanner.close();
    }
}
