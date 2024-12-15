
package ass;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Enter an integer: ");
	            int input = scanner.nextInt();

	            // Attempt division
	            int result = 100 / input;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Program execution completed.");
	            scanner.close();
	        }
	    }

}
