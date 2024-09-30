/**
    fileName:_______Change.java
    Student:________
    Prof:___________
    Class:__________
    Date:___________26/09/24 (dd/mm/yy)
    Instructions:___Implement a program that directs a cashier how to give change. 
                    The program has two inputs: the amount due AND the amount received form the customer. 
                    Display the dollars, quarters, dimes, nickels, and pennies that the customer should receive in return. 
                    In order to avoid roundoff errors, the program user should supply both amounts in pennies (for example 274 instead of 2.74).
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int dollars, quarters, dimes, nickels, pennies;
        int dollars, quarters, dimes, change, afterDollar, afterQuarter, afterDime, afterNickel;
        int nickels = 0;
        int pennies = 0;
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        final int PENNIES_PER_DIME = 10;
        final int PENNIES_PER_NICKEL = 5;

        //Starting prompt and read in for amount due
        System.out.print("Enter total amount due in pennies (if $12.83, enter 1283): ");
        int due = in.nextInt();

        // prompt for amount received form the customer
        System.out.print("Enter amount received form the customer in pennies (if $15.00, enter 1500): ");
        int received = in.nextInt();

        // calculates change
        change = received - due;
        
        // calculates amount of dollars and assigns to dollars
        dollars = change / PENNIES_PER_DOLLAR;
        // calculates cents remaining after amount of dollars calculation
        afterDollar = change % PENNIES_PER_DOLLAR;

        // calculates amount of quarters and assigns to quarters
        quarters = afterDollar / PENNIES_PER_QUARTER;
        // calculates cents remaining after amount of quarters calculation
        afterQuarter = afterDollar % PENNIES_PER_QUARTER;

        // calculates amount of quarters and assigns to dimes
        dimes = afterQuarter / PENNIES_PER_DIME;
        // calculates cents remaining after amount of quarters calculation
        afterDime = afterQuarter % PENNIES_PER_DIME;

        // calculates amount of quarters and assigns to nickels
        nickels = afterDime / PENNIES_PER_NICKEL;
        // calculates cents remaining after amount of dimes calculation
        afterNickel = afterDime % PENNIES_PER_NICKEL;

        // calculates cents remaining after amount of pennies calculation
        pennies   = afterNickel % PENNIES_PER_NICKEL;

        System.out.println("Please provide customer with: \n\n" + dollars + "x Dollars,\n"  + quarters + "x Quarters,\n" + dimes + "x Dimes,\n" + nickels + "x Nickels and\n" + pennies   + "x Pennies.");
        
    }
    
    
}
