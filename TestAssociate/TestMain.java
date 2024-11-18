/*
 * Program: TestMain.java
 * Student: Lydia Frame 
 * Purpose: Demonstrates the use of Bagger, Cashier, and Manager classes 
 *          by creating objects and calling their respective methods.
 */

 import java.util.Scanner; // Import the Scanner class (not used in this example but included for potential user input)

 public class TestMain {
 
     public static void main(String[] args) {
         // Create an instance of the Bagger class and call its method
         Bagger bagger = new Bagger("Tim"); 
         bagger.Call(); // Invokes the Call method of the Bagger class
 
         System.out.println(); // Prints a blank line for better output separation
 
         // Create an instance of the Cashier class and call its method
         Cashier cashier = new Cashier("Myra");
         cashier.Call(); // Invokes the Call method of the Cashier class
 
         System.out.println(); // Prints a blank line for better output separation
 
         // Create an instance of the Manager class and call its method
         Manager manager = new Manager("Alex"); 
         manager.Call(); // Invokes the Call method of the Manager class
     }
 }