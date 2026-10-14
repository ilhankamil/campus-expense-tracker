
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        double allowance = 800.00;
        Scanner input = new Scanner(System.in); // hi
        double expense = 0;

System.out.println("Welcome to the Expense Tracker!");
        System.out.printf("Your monthly allowance is: RM%.2f%n", allowance);
        System.out.println("Please enter your expenses for the month.");
        System.out.println("How many expenses would you like to enter?");

        int numExpenses = input.nextInt(); // ask user how many input?
        double[] expenses = new double[numExpenses]; // how much did user spend for this expense?
        String[] categories = new String[numExpenses]; // what category is this expense?

        for (int i = 0; i < numExpenses; i++) {
            System.out.print("Enter expense amount: RM");
            expenses[i] = input.nextDouble();
            System.out.print("Enter expense category: ");
            categories[i] = input.next();
            expense += expenses[i];
        }

        double remaining = allowance - expense;
System.out.println("\nYour individual expenses:");

for (int i = 0; i < numExpenses; i++) {
    System.out.printf("Expense %d: RM%.2f%n", i + 1, expenses[i]);
    System.out.printf("Category: %s%n", categories[i]);
}
        System.out.printf("Allowance: RM%.2f%n", allowance);
        System.out.printf("Expense: RM%.2f%n", expense);
        System.out.printf("Remaining: RM%.2f%n", remaining);
        input.close();
    }
}
