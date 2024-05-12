import java.util.Scanner;
public class SearchingInArray {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr;
        int size;
        int num;
        int temp=-1,temp2=0;

        System.out.println("Enter the size of the array");
        size=input.nextInt();

        arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Enter the number you want to search");
        num=input.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==num){
                temp=i;
            }

            else{
                temp2=-2;
            }
        }

        
        if(temp!=-1){
            System.out.println("The number is found at index:"+ temp);
        }
        
        else if(temp2!=0){
            System.out.println("The number is not found");
        }

        input.close();
    } 
}