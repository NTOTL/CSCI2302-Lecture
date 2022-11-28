package Chapter12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_25{
    public static void main(String[] args) throws FileNotFoundException {
        int[] counts = new int[3];
        double[] salaryTotal = new double[3];
        File file = new File("Chapter12/salary.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String[] facultyInfo = input.nextLine().split(" ");
            switch (facultyInfo[2]){
                case "assistant":
                    counts[0]++;
                    salaryTotal[0] += Double.parseDouble(facultyInfo[3]);
                    break;
                case "associate":
                    counts[1]++;
                    salaryTotal[1] += Double.parseDouble(facultyInfo[3]);
                    break;
                case "full":
                    counts[2]++;
                    salaryTotal[2] += Double.parseDouble(facultyInfo[3]);
                    break;
            }            
        }
        System.out.printf("Total salary for assistnat professors: %11.2f. Average: %8.2f\n", salaryTotal[0], salaryTotal[0]/counts[0]);
        System.out.printf("Total salary for associate professors: %11.2f. Average: %8.2f\n", salaryTotal[1], salaryTotal[1]/counts[1]);
        System.out.printf("Total salary for full professors: %11.2f. Average: %8.2f\n", salaryTotal[2], salaryTotal[2]/counts[2]);
    }
}
