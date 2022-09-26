package Chapter07;

import java.util.*;;

public class Intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five scores: ");
        double score1 = input.nextDouble();
        double score2 = input.nextDouble();
        double score3 = input.nextDouble();
        double score4 = input.nextDouble();
        double score5 = input.nextDouble();

        double sum = score1 + score2 + score3 + score4 + score5;
        double average = sum / 5;

        int count = 0;
        if (score1 > average)
            count++; // count = count + 1;

        if (score2 > average) {
            count++;
        }

        if (score3 > average)
            count++; // count = count + 1;

        if (score4 > average)
            count++; // count = count + 1;

        if (score5 > average)
            count++; // count = count + 1;

        input.close();

    }
}