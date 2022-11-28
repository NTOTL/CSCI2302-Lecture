package Chapter12;

import java.util.Scanner;
import java.io.IOException;
import java.net.*;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        // Scanner input = new Scanner(System.in);
        //String URLString = input.next();
        String URLString = new Scanner(System.in).next();

        try{
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                System.out.println(line);
                count += line.length();
            }
            System.out.println("The file size is " + count);
            input.close();
        }
        catch (MalformedURLException ex){
            System.out.println("Invalid URL.");
        }
        catch (IOException ex){
            System.out.println("Cannot read the file.");
        }
        
    }
}
