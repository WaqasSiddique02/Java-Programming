import java.util.Scanner;
public class SumOfArray {
    static float Sum(float[] arr, int size){
        float sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float[] array;
        int size;

        System.out.println("Enter the size of the array");
        size=input.nextInt();
        array=new float[size];

        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i]=input.nextFloat();
        }

        System.out.println("Sum of the elements of the array: "+ Sum(array,size));

        input.close();
    }
}