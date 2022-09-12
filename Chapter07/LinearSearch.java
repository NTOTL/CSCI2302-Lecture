package Chapter07;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[15];
        initializeArrayWithRandomInteger(array);
        System.out.print("Enter a value between 0 and 10: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        int index = linearSearch(array, key);

        if (index != -1)
        {
            System.out.println("Found the value at the inex " + index);
        }
        else
        {
            System.out.println("Could not find the value");
        }

        printArray(array);
        input.close();
    }

    private static void initializeArrayWithRandomInteger(int[] list) {
        for (int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 11);
        }
    }

    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++){
            if (list[i] == key)
                return i;            
        }
        return -1;
    }
    private static void printArray(int[] userScores) {
        for (int i = 0; i < userScores.length; i++){
            System.out.print(userScores[i] + " ");
        }
        System.out.println();
    }
}
