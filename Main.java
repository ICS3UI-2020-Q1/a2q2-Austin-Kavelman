import java.util.Scanner;

/**
 *This program determines which number is greater
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets the users first interger and prints it on the screen
    System.out.println("Please enter the first interger:");
    int a = input.nextInt();
    
    //Gets the users second interger and prints it on the screen
    System.out.println("Please enter the second interger:");
    int b = input.nextInt();

    //Checks to see which number is larger
    if (a > b) { 
    System.out.println("The first number is larger");
    } else if (b > a) {
    System.out.println("The second number is larger");
    } else if (a == b) {
    System.out.println("Both of the intergers are equal");
    }


  }
}
