
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        double allowance = 800.00;
        Scanner input = new Scanner(System.in);
        double expense = 0;

System.out.println("Welcome to the Expense Tracker!");
        System.out.println("Your monthly allowance is: RM" + allowance);
        System.out.println("Please enter your expenses for the month.");
        System.out.println("How many expenses would you like to enter? (Maximum 5)");
        int numExpenses = input.nextInt();

        for (int i = 0; i < numExpenses; i++) {
            System.out.print("Enter expense amount: RM");
            expense += input.nextDouble();
        }

        double remaining = allowance - expense;

        System.out.println("Allowance: RM" + allowance);
        System.out.println("Expense: RM" + expense);
        System.out.println("Remaining: RM" + remaining);
    }
}
