package Chapter08;

public class Processing2DArrays {
    
    public static void main(String[] args) {
        final int rowSize = 5;
        final int columnSize = 5;
        int[][] matrix = new int[rowSize][columnSize];

        // 1. Initialize the array with randome integers
        // int[][] array = randomizeArray(matrix);
        randomizeArray(matrix);
        // 2. Print a 2D array
        printArray(matrix);

        // 3. Calculate and print the sum of each row of the array
        printSumOfEachRow(matrix);

        // 4. Calculate and print the sum of each column of the array
        // printSumOfEachColumn(matrix);

        //shuffleArray(matrix);
        //printArray(matrix);

        printDiagonalSum(matrix);

        printIndexOfMaximumRowSum(matrix);
    }

    private static void printIndexOfMaximumRowSum(int[][] m) {
        int maxRowIndex = 0;
        int previousTotal = 0;
        for (int i = 0; i < m.length; i++){

            // Calculate the sum of the current row
            // by looping through all the columns in the row
            int total = 0;
            for (int j = 0; j < m[i].length; j++)
            {
                total += m[i][j];
            }
            // end of calculating the sum of the current row
            
            if (total > previousTotal){
                previousTotal = total;
                maxRowIndex = i;
            }
        }
        System.out.printf("Row %d has the largest row sum of %d\n", maxRowIndex, previousTotal);
    }

    private static void printDiagonalSum(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j< m[i].length; j++){
                if (i == j){
                    total += m[i][j];
                }
            }
        }
        System.out.printf("The sum of the diagonal elements is %d\n", total);
    }

    private static void shuffleArray(int[][] m) {
        for (int rowIndex = 0; rowIndex < m.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++){
                int rowID = (int)(Math.random() * m.length);
                int colID = (int)(Math.random() * m[rowIndex].length);
                int temp = m[rowIndex][columnIndex];
                m[rowIndex][columnIndex] = m[rowID][colID];
                m[rowID][colID] = temp;
            }
        }
    }

    private static void printSumOfEachColumn(int[][] m) {
        for (int columnIndex = 0; columnIndex < m[0].length; columnIndex++){
            /*
            int total = 0;
            for (int rowIndex = 0; rowIndex < m.length; rowIndex++){
                total += m[rowIndex][columnIndex];
            }
            */
            int total = sumColumn(m, columnIndex);

            System.out.printf("The sum of Column %d is %d\n", columnIndex, total);
        }
    }

    private static int sumColumn(int[][] list, int colId) {
        int total = 0;
        for (int rowId = 0; rowId < list.length; rowId++){
            total += list[rowId][colId];
        }
        return total;
    }

    private static void printSumOfEachRow(int[][] m) {
        for (int rowIndex = 0; rowIndex < m.length; rowIndex++ ){
            int total = 0; 
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++){
                total += m[rowIndex][columnIndex];
            }
            System.out.printf("The sum of Row %d is %d \n", rowIndex, total);

        }
    }

    private static void printArray(int[][] m) {
        for (int rowIndex = 0; rowIndex < m.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++){
                System.out.printf("%2d ", m[rowIndex][columnIndex]);
            }
            System.out.println();
        }
    }

    private static void randomizeArray(int[][] m) {
        for (int rowIndex = 0; rowIndex < m.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++){
                m[rowIndex][columnIndex] = (int)(Math.random() * 51);
            }
        }
    }
}
