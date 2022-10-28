package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                isInputValid = true;
                System.out.printf("%d / %d is %d", number1, number2, Quotient(number1, number2));
            } catch (InputMismatchException ex) {
                System.out.println("An integer is required.");
                input.nextLine();
            } catch (ArithmeticException ex) {
                System.out.println("An integer cannot be divided by zero.");
            } 
        }
        input.close();
    }

    public static int Quotient(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            return number1 / number2;
        }
    }
}
