package Chapter07;
import java.util.*;
public class ProcessingArrays {
    public static void main(String[] args) {
        double[] scores = new double[10];
        // 1. Initialize an array with input values
        // initializeArray(scores);
        // 2. Initialize an array with random values
        initializeArrayWithRandomValues(scores);
        // 3. Print an array
        printArray(scores);
        // 4. Find the maximum element in the array
        // and return the index of the element
        int index = findMaximumElement(scores);
        System.out.println("The maximum element is at index " + index);
    }

    private static int findMaximumElement(double[] userScores) {
        int currentIndex = 0;
        double maxValue = userScores[0];
        for (int i = 1; i < userScores.length; i++){
            if (userScores[i] > maxValue){
                maxValue = userScores[i];
                currentIndex = i;
            }
        }
        return currentIndex;
    }

    private static void initializeArrayWithRandomValues(double[] userScores) {
        // [a, b] Math.random()* (b - a + 1) + a
        // [0, 100] Math.random() * 101
        //Math.random();
        for (int i = 0; i < userScores.length; i++){
            userScores[i] = Math.random() * 101;
        }
    }

    private static void printArray(double[] userScores) {
        for (int i = 0; i < userScores.length; i++){
            System.out.print(userScores[i] + " ");
        }
    }

    private static void initializeArray(double[] userScores) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 scores: ");
        for (int i = 0; i < userScores.length; i++){
            userScores[i] = input.nextDouble();
        }
        input.close();
    }

   
    
}
