/*
    fileName:________F2C.java
    Student:_________
    Prof:____________
    Class:___________
    Date:____________26/09/24 (dd/mm/yy)
    Instructions:____Convert from degrees Fahrenheit to degrees Celsius.
                     The program should prompt for a temperature in Fahrenheit and output a temperature in Celsius.
                     All calculations should be done in ints, so be careful of truncation.
                     Formula: (32°F − 32) × 5/9 = 0°C
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        // declaring and initializing needed variales, and final VARIABLES
        //int fahrenheit;
        int celsius;
        int i = 1;
        final int FAREN_FREEZ = 32;
        //final int FIVE_OVER_NINE = 5/9;

        // Creating a Scanner object "in"
        Scanner in = new Scanner(System.in);

        // Innitial prompt to the user, requesting degrees in fahrenheit
        System.out.print("Please enter a degree in Fahrenheit to convert to Celsius: ");

        // Reciveing user input of degree in fahrenheit
        int fahrenheit = in.nextInt();

        /*  calculation to convert from degrees Fahrenheit to degrees Celsius
            (32°F − 32) × 5/9 = 0°C       */
        celsius = (fahrenheit - FAREN_FREEZ) * 5;

        //repeated subtraction
        while(celsius > 9){
            celsius -= 9;
            i++;
        }
        
        // Output celsius
        System.out.println(fahrenheit + " degrees fahrenheit, is >> " + i + " << degrees celsius.");

    }
    
    
}
