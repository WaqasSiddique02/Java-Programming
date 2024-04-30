import java.util.Scanner;
public class practice {
    public static void main(String[] args) { 
        try (Scanner myObj = new Scanner(System.in)) { 
            String Fname;
            String Lname;
            int contact;
            char grade;
            float total_marks=100;
            float obtained_marks;
            System.out.println("Enter username (Firstname Lastname):");
            Fname = myObj.nextLine();
            Lname = myObj.nextLine(); 

            System.out.println("Enter Contact information:");
            contact = myObj.nextInt();

            System.out.println("Enter Obtained marks:");
            obtained_marks = myObj.nextFloat();

            if(obtained_marks>=90){
                grade='A';
            }

            else if(obtained_marks>=80 && obtained_marks<90){
                grade='B';
            }

            else if(obtained_marks>=70 && obtained_marks<80){
                grade='C';
            }

            else if(obtained_marks>=60 && obtained_marks<70){
                grade='D';
            }

            else{
                grade='F';
            }

            System.out.println("Displaying Student Report:");
            System.out.println("Full name: " + Fname + " " + Lname);
            System.out.println("Contact: " + contact);
            
            System.out.println("Total Marks: " + total_marks);
            System.out.println("Obtained Marks: " + obtained_marks);
            System.out.println("Grade: " + grade);
        } 
    }
}
