import java.util.Scanner;
public class factorial {

    static int findFactorial(int number){
        int fac=1;
        if(number==0||number==1){
            return 1;
        }
        else{
            for(int i=1;i<=number;i++){
                fac=fac*(i);
            }
            return fac;
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int no;

        System.out.println("Enter the number you want to find factorial of ");
        no=input.nextInt();

        System.out.println("Factorial of your provided number is : "+ findFactorial(no)); 
        input.close();
    }
}
