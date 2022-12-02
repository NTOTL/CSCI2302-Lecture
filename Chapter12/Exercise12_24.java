package Chapter12;
import java.io.*;

public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Chapter12/salary.txt");
        PrintWriter output = new PrintWriter(file);

        for (int i = 1; i <=1000; i++){
            output.printf("FirstName%s LastName%s %s\n", i, i, getRankAndSalary());
        }

        output.close();
    }

    private static String getRankAndSalary() {
        String[] ranks = new String[]{"assistant", "associate", "full"};
        int rankIdx = (int)(Math.random() * 3); // get randome integer 0-2;
        double salary = 0;
        switch (rankIdx){
            case 0:
                salary = 50000 + Math.random() * 30001;
                break;
            case 1:
                salary = 60000 + Math.random() * 50001;
                break;
            case 2:
                salary = 75000 + Math.random() * 55001;
                break;
        }
        return String.format("%s %.2f", ranks[rankIdx], salary);
    }
}
