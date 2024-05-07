import java.util.Scanner;
public class Task_two {
    
    public static int rate(int pop, float B_rate, float D_rate) {
        int newpop;
        newpop = pop + (int)(((B_rate * pop) / 100) - ((D_rate * pop) / 100));
        return newpop;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pop, years, total;
        float birthrate, deathrate;

        System.out.println("Enter the starting size of population:");
        pop = scanner.nextInt();

        System.out.println("Enter the annual birth rate:");
        birthrate = scanner.nextFloat();

        System.out.println("Enter the death rate:");
        deathrate = scanner.nextFloat();

        System.out.println("How many years do you want to calculate:");
        years = scanner.nextInt();

        total = rate(pop, birthrate, deathrate);

        System.out.println("The new population is: " + total);

        if (pop >= 2 && birthrate >= 1) {
            for (int i = 1; i < years; i++) {
                total = rate(total, birthrate, deathrate); 
            }
            System.out.println("The new total population is: " + total);
        } else {
            System.out.println("Error in entered value!!!");
        }

        scanner.close();
    }
}
