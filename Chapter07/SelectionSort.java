package Chapter07;

public class SelectionSort {

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length -1 ; i++) {         
          
            int minIndex = findMaximumElementIndex(list);
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;            
        }
    }

    public static int findMaximumElementIndex(int[] list){
        int currentIndex = 0;
        double minValue = list[0];
        for (int i = 1; i < list.length; i++){
            if (list[i] < minValue){
                minValue = list[i];
                currentIndex = i;
            }
        }
        return currentIndex;
    }
}
