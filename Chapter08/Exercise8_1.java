package Chapter08;

public class Exercise8_1 {
    // getArray();
    public static void main(String[] args) {
        double[][] list = new double[3][4];

        for (int colId = 0; colId < list[0].length; colId++) {
            double sum = sumColumn(list, colId);
        }
    }

    private static double sumColumn(double[][] list, int colId) {
        int total = 0;
        for (int rowId = 0; rowId < list.length; rowId++){
            total += list[rowId][colId];
        }
        return total;
    }

}
