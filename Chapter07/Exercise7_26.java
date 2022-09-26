package Chapter07;
import java.util.Scanner;
public class Exercise7_26 {
    public static void main(String[] args) {
        // get two arrays
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++)
        {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i< size2; i++){
            list2[i] = input.nextInt();
        }

       if (java.util.Arrays.equals(list1, list2)){
            // they are strictly identical
       }

       input.close();

    }

   
}
