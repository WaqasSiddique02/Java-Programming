import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        String userin;
        Scanner input= new Scanner(System.in);
        System.out.println("Palindrome");

        System.out.println("Enter the string");
        userin = input.nextLine();

        char[] arr=userin.toCharArray();
        boolean isPalindrome=true;

        for(int i=0;i<userin.length();i++){
            arr[i]=Character.toLowerCase(arr[i]);
        }

        for(int i=0;i<userin.length();i++){
            if(arr[i]!=arr[arr.length-1-i]){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The entered String is palindrome");
        }

        else{
            System.out.println("The entered String is not palindrome");
        }

        input.close();
}
}