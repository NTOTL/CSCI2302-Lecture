package Chapter12;
import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        java.io.File f = new File("Chapter12/scores.txt");        
        Scanner input = new Scanner(f);
        String firstName, middleInitial, lastName;
        double score;
        while (input.hasNext()){
            firstName = input.next();
            middleInitial = input.next();
            lastName = input.next();
            score = input.nextDouble();
            System.out.println(firstName + " " + middleInitial + " " + lastName
            + " " + score);
        }
    }
}
