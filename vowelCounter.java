import java.util.Scanner;
public class vowelsCount{
    public static void main(String[] args) {
        String str;
        int count=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the string you want to find the number of vowels in");
        str=input.nextLine();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }
        }

        System.out.println("The number of vowels in the provided string are : "+ count);

        input.close();
    }
}
