/**

Minutes.java - add your solutiuon to program 2 of homework 1 here.

    fileName:_______Minutes.java
    Student:________
    Prof:___________
    Class:__________
    Date:___________26/09/24 (dd/mm/yy)
    Instructions:___Create an application in Java that asks a user for a number of hours, days, weeks, and years.
                    It then computes the equivalent number of minutes (ignoring leap years).
                    Edit the file Minutes.java included in the workspace.
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        // Creating a Scanner object "in"
        Scanner in = new Scanner(System.in);

        //declaring thisManyMin to initially hold the value 0
        int thisManyMin = 0;

        //declaring final time frame variables
        final int HOURS = 60;
        final int DAYS = 1440;
        final int WEEKS = 10080;
        final int YEARS = 525600;

        //initial prompt to start program
        System.out.print("\nTick-Tock!\nThis program will tell you how many MINUTES there are in a given timeframe. First enter a number of Hours: ");
        
        // user inputs hours
        // variable "userHrs" is hours supplyed by user
        int userHrs = in.nextInt();
        
        //ensure userHrs is positive 
        while (userHrs <= -1){
            System.out.print("Please enter a non-negative number of Hours: ");
            userHrs = in.nextInt();
        }
        thisManyMin += (userHrs * HOURS);
        
        System.out.print("How many Days? ");
        int userDys = in.nextInt();

        //ensure userDys is positive 
        while (userDys <= -1){
            System.out.print("Please enter a non-negative number of Days: ");
            userDys = in.nextInt();
        }
        thisManyMin += (userDys * DAYS);

        System.out.print("How many Weeks? ");
        int userWks = in.nextInt();

        //ensure userWks is positive
        while (userWks <= -1){
            System.out.print("Please enter a non-negative number of Weeks: ");
            userWks = in.nextInt();
        }

        thisManyMin += (userWks * WEEKS);

        System.out.print("And how many Years? ");
        int userYrs = in.nextInt();

        //ensure userYrs is positive
        while (userYrs <= -1){
            System.out.print("Please enter a non-negative number of Years: ");
            userYrs = in.nextInt();
        }

        
        thisManyMin += (userYrs * YEARS);

        System.out.println("There are\t>" + thisManyMin + "<\t minutes in " + userHrs + " hours, " + userDys + " days, and " + userWks + " weeks, and " + userYrs+ " years.");

        
    }
    
    
}
