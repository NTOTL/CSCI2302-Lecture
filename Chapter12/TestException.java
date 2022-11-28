package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        boolean continueInput = true;
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                continueInput = false;
                System.out.printf("%d / %d is %d", number1, number2, Quotient(number1, number2));
            } catch (InputMismatchException ex) {
                System.out.println("Exception: an integer is required.");
                input.nextLine();
            } catch (ArithmeticException ex) {
                System.out.println("Exception: an integer cannot be divided by zero");
            }
            catch (Exception ex){
                System.out.println("Exception: an error occurred. I don't know why.");
            }
            finally{
                System.out.println("The finally block will run no matter what.");
            }
        } while (continueInput);

        input.close();
    }

    public static int Quotient(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        } else {
            return number1 / number2;
        }
    }
}
