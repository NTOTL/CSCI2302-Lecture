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
        int index = findMaximumElementIndex(scores);
        System.out.println("The maximum element is at index " + index);   

         // 6. Find the maximum element in the array
         double maxElement = findMaximumElement(scores);
         System.out.println("The maximum element of the array is " + maxElement);
        
        // 5. Find the sum of the array elements
        double sumOfArray = getSumOfArrayElements(scores);
        System.out.println("The sum of the array elements is: " + sumOfArray); 
        
        double average = sumOfArray / scores.length;
        // System.out.println("The average of the array elements is: " + average);
        System.out.printf("The average of the array element is %6.2f\n", average);
       

    }

   
    private static double findMaximumElement(double[] userScores) {
        double maxValue = userScores[0];
        for (int i = 1; i < userScores.length; i++){
            if (userScores[i] > maxValue){
                maxValue = userScores[i];
            }
        }
        return maxValue;
    }


    private static double getSumOfArrayElements(double[] userScores) {
        double sum = 0;
        for (int i = 0; i < userScores.length; i++){
            sum = sum + userScores[i];  // sum += userScores[i];
        }
        return sum;
    }


    private static int findMaximumElementIndex(double[] userScores) {
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
            double rand = Math.random() * 101;
            rand = rand * 10;
            long temp = Math.round(rand);
            userScores[i] = temp / 10.0;

        }
    }

    private static void printArray(double[] userScores) {
        for (int i = 0; i < userScores.length; i++){
            System.out.print(userScores[i] + " ");
        }
        System.out.println();
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
