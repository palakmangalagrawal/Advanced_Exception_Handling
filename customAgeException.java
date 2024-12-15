package ass;

import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class customAgeException {
	public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150. Invalid input: " + age);
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            validateAge(age);
            System.out.println("Age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for age.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
	}

