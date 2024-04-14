package helloaworld;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = scanner.nextDouble();

        System.out.print("Enter b = ");
        double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter operator (+, -, *, /) = ");
        String operator = scanner.nextLine().trim(); // Trim to remove whitespace

        if (operator.equals("+"))
            System.out.println("The addition = " + (a + b));
        else if (operator.equals("-"))
            System.out.println("The subtraction = " + (a - b));
        else if (operator.equals("/")) {
            if (b == 0)
                System.out.println("Error: Division by zero!");
            else
                System.out.println("The division = " + (a / b));
        } else if (operator.equals("*"))
            System.out.println("The multiplication = " + (a * b));
        else
            System.out.println("Invalid operator");

        // Close the scanner
        scanner.close();
    }
}
