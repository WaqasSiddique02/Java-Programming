import java.util.Scanner;
public class Quiz {
    public static double volume(double radius) {
        double pi = 3.1415;
        return (4 * pi * Math.pow(radius, 3)) / 3;
    }

    public static int volume(int popu, float birth_r, float death_r) {
        return popu + (int)(((birth_r * popu) / 100) - ((death_r * popu) / 100));
    }

    public static float volume(float a1, float a2) {
        return 180 - a1 - a2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a option: ");
        System.out.println("1. Volume of sphere");
        System.out.println("2. Population rate");
        System.out.println("3. Third angle of triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius of the sphere : ");
                double radius = scanner.nextDouble();
                System.out.println("The volume is " + volume(radius) + " meter cube");
                break;
            case 2:
                System.out.println("Enter population starting size:");
                int population = scanner.nextInt();
                System.out.println("Enter the annual birth rate:");
                float birthrate = scanner.nextFloat();
                System.out.println("Enter the annual death rate:");
                float deathrate = scanner.nextFloat();
                System.out.println("How many years do you want to calculate: ");
                int years = scanner.nextInt();
                System.out.println("The population after " + years + " years will be: " + volume(population, birthrate, deathrate)*years);
                break;
            case 3:
                System.out.println("Enter the 2 angles of a triangle:");
                float angle1 = scanner.nextFloat();
                float angle2 = scanner.nextFloat();
                System.out.println("The 3rd Calculated angle of the triangle is: " + volume(angle1, angle2));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
