import java.util.Scanner;
public class LargestNoInArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size;
        int[] ar;

        System.out.println("Enter the size of the array: ");
        size=input.nextInt();

        ar=new int[size];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            ar[i]=input.nextInt();
        }

        int largest=ar[0];
        for(int i=0;i<size;i++){
            if(ar[i]>largest){
                largest=ar[i];
            }
        }

        System.out.println("The largest Number in the array: "+ largest);

        input.close();
    }
}