import java.util.Scanner;
public class Task_3 {

    public static float angle3(float angle1, float angle2) {
        float ang3;
        ang3 = 180 - angle1 - angle2;
        return ang3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a1, a2;

        System.out.println("Enter two angles of a triangle:");
        a1 = scanner.nextFloat();
        a2 = scanner.nextFloat();

        System.out.println("The third angle of the triangle is: " + angle3(a1, a2));

        scanner.close();
    }
}
