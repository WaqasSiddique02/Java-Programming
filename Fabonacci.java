import java.util.Scanner;
public class Fabonacci {
    
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        else {
            return (fib(n-1)+fib(n-2));
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the number you want to find fibonacii series");
        num=input.nextInt();

        for(int i=0;i<num;i++){
            System.out.println("The fibonacii series is: "+ fib(i));
        }
        
        input.close();
    }
}