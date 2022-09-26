package Chapter07;
import java.util.Scanner;
public class Exercise7_5 {

    public static void main(String[] args) {
        // get the input to populate the array
    int[] list = new int[10];
    populateArray(list);
    // eliminate the duplicates and print the array
    printDisdinctnumbers(list);
    
    }

    private static void printDisdinctnumbers(int[] list) {
        int count = 0;
        int[] distinctList = new int[list.length];
        // distinctList[0] = list[0];
        for (int i = 0; i < list.length; i++){
            if (linearSearch(distinctList, list[i]) == -1) {
                distinctList[count] = list[i];
                count++;
            }
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i ++){
            System.out.printf("%d ", distinctList[i]);
        }
        
    }

    private static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        int[] distinctList = new int[list.length];
        // distinctList[0] = list[0];
        for (int i = 0; i < list.length; i++){
            if (linearSearch(distinctList, list[i]) == -1) {
                distinctList[count] = list[i];
                count++;
            }
        }

        int[] newList = new int[count];
        for (int i = 0; i< count; i++){
            newList[i] = distinctList[i];
        }
        return newList;
    }

    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++){
            if (list[i] == key)
                return i;            
        }
        return -1;
    }



    private static void populateArray(int[] list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            list[i] = input.nextInt();
        }
        input.close();
    }
    
}
