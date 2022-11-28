package Chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws IOException, InputMismatchException {
        java.io.File file = new File("Chapter12/scores.txt");
        // if (file.exists()){
        // System.out.println("File already exists.");
        // System.exit(1);
        // }
        java.io.PrintWriter output = new PrintWriter(file);
        // output.print("John T. Smith ");
        // output.println(90);
        // output.print("Eric K. Jones ");
        // output.print(85);

        java.util.Scanner input = new Scanner(System.in);
        String studentName = "";
        double score;
        System.out.print("Enter student's name (or # to stop): ");
        studentName = input.nextLine();
        while (!studentName.equals("#")) {
            System.out.print("Enter student's score: ");
            score = input.nextDouble();
            input.nextLine();
            output.print(studentName);
            output.print(" ");
            output.println(score);

            System.out.print("Enter student's name (or # to stop): ");
            studentName = input.nextLine();
        }
        input.close();
        output.close();
    }
}
