/*
 * Programmer: Kaydnen Dunlop
 * Date: October, 8. 2020
 * Purpose: to square root a number
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Asks the user for the diameter
        System.err.print("Enter a number to square root: ");
        double radicand = input.nextDouble();

        // To check that the input is not negative
        while (radicand < 0) {
            System.err.println("Invalid input!");
            System.err.print("Enter a number to square root: ");
            radicand = input.nextDouble();
        }

        // The equation that square roots the number
        double root = Math.sqrt(radicand);

        // Create a decimal formatter
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        // Print the results
        System.out.println("The square root of " + formatter.format(radicand) + 
                " is " + formatter.format(root) + ".");
        
           
    }
              
    
}
