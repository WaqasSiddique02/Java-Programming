import java.util.Scanner;

public class Task {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter the No of elements of the address");
        n = input.nextInt();

        input.nextLine(); 

        System.out.println("Enter Your Address");
        String address = input.nextLine();

        String[] addressArray;
        addressArray = address.split(" ");

        if (addressArray.length != n) {
            System.out.println("Number of elements entered does not match the specified number.");
            input.close();
            return;
        }

 
        System.out.println("Address Elements:");
        for (String element : addressArray) {
            System.out.println(element);
        }

        input.close();
    }
}
