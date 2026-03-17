import java.util.Scanner;

/**
 * PrimeNumbersInInterval
 *
 * This program reads two positive integers between 2 and 20000
 * and prints how many prime numbers exist in the inclusive interval.
 *
 * Example:
 * Input:  10 20
 * Output: 4
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two input numbers
        System.out.println("Let's calculate the total number of prime numbers present in the range between 2 and 20000 that we determine\n");;
        System.out.println("Enter the first integer in the range");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer in the range");
        int b = scanner.nextInt();
        
        // Validate that both numbers are within the allowed range
        if (!isValidRange(a) || !isValidRange(b)) {
            System.out.println("Error: both numbers must be between 2 and 20000.");
            scanner.close();
            return;
        }

        // Determine the start and end of the interval
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int primeCount = 0;

        // Check every number in the interval
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        // Print the number of primes found
        System.out.println("Result: In total there are " + primeCount + " prime numbers.");

        scanner.close();
    }
    
    /**
     * Validates whether a number is inside the allowed range.
     *
     * @param number the number to validate
     * @return true if the number is between 2 and 20000, false otherwise
     */
    public static boolean isValidRange(int number) {
        return number >= 2 && number <= 20000;
    }

    /**
     * Checks whether a number is prime.
     *
     * @param number the number to evaluate
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }

        // 2 is the smallest prime number
        if (number == 2) {
            return true;
        }

        // Even numbers greater than 2 are not prime
        if (number % 2 == 0) {
            return false;
        }

        // Check odd divisors up to the square root of the number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
