import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] ages = new int[5];
        int[] rollNumbers = new int[5];
        char[] grades = new char[5];
        String[] addresses = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");

            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Age: ");
            ages[i] = Integer.parseInt(scanner.nextLine());

            System.out.print("Roll Number: ");
            rollNumbers[i] = Integer.parseInt(scanner.nextLine());

            System.out.print("Grade: ");
            grades[i] = scanner.nextLine().charAt(0);

            System.out.print("Address: ");
            addresses[i] = scanner.nextLine();
        }

        System.out.println("\nDetails of all students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Grade: " + Character.toUpperCase(grades[i]));
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }

        scanner.close();
    }
}
