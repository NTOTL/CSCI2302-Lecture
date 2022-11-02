package Chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new File("Chapter12/scores.txt");
        // if (file.exists()){
        //     System.out.println("File already exists.");
        //     System.exit(1);
        // }
        java.io.PrintWriter output = new PrintWriter(file);
        // output.print("John T. Smith ");
        // output.println(90);
        // output.print("Eric K. Jones ");
        // output.print(85);

        java.util.Scanner input = new Scanner(System.in);
        String endOfInput = "";
        while (endOfInput != "#")
        {
            System.out.print("Enter student's name: ");
            String name = input.nextLine();
            if (name != "#"){
                output.print(name);
                System.out.print("Enter student's score: ");
                output.println(input.nextLine());
            }
            else{
                endOfInput = "#";
            }
        }
        input.close();
        output.close();
    }
}
