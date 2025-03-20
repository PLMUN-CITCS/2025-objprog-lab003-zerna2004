import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Get an integer
            System.out.print("Enter an integer: ");
            int userInt = input.nextInt();

            // Get a decimal number
            System.out.print("Enter a decimal number: ");
            double userDouble = input.nextDouble();

            // Consume the newline left after nextDouble()
            input.nextLine();

            // Get a string
            System.out.print("Enter a word or sentence: ");
            String userString = input.nextLine();

            // Output the results
            System.out.printf("Your integer: %d%n", userInt);
            System.out.printf("Your decimal number: %.2f%n", userDouble);
            System.out.printf("Your string: %s%n", userString);
        }
    }
}
