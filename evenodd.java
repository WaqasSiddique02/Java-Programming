import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        n=input.nextInt();
        if(n%2==0){
            System.out.println("The number is even");
        }

        else{
            System.out.println("The number is odd ");
        }

        input.close();
    }
}