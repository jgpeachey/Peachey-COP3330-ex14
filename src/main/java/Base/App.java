/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Write a simple program to compute the tax on an order amount. The program
should prompt for the order amount and the state. If the state is “WI,”
then the order must be charged 5.5% tax. The program should display the
subtotal, tax, and total for Wisconsin residents but display just the total
for non-residents.

Example Output:
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
        Or
What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
*Implement this program using only a simple if statement—don’t use an else
clause.
*Ensure that all money is rounded up to the nearest cent.
*Use a single output statement at the end of the program to display the
program results.

Challenges:
*Allow the user to enter a state abbreviation in upper, lower, or mixed
case.
*Also allow the user to enter the state’s full name in upper, lower, or
mixed case.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double total = 0;
        double tax = 0;

        System.out.println("What is the order amount?");
        double amount = in.nextDouble();
        System.out.println("What is the state?");
        String state = in.next();

        if(state.equals("WI")){
            tax = 0.055*amount;
            total = amount+tax;
            System.out.println("The subtotal is $"+amount+".");
            System.out.println("The tax is $"+tax+".");
            System.out.println("The total is $"+total+".");
        }
        else{
            total = amount;
            System.out.println("The total is $"+total+".");
        }
    }
}
