package Chapter12;
import java.io.*;

public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Chapter12/salary.txt");
        PrintWriter output = new PrintWriter(file);

        for (int i = 1; i<= 1000; i++){
            output.printf("FirstName%d LastName%d %s\n", i, i, getRankAndSalary());
        }
        output.close();
    }

    private static String getRankAndSalary() {
        String[] ranks = new String[]{"assistant", "associate", "full"};
        int rankIdx = (int)(Math.random() * 3);
        double salary = 0;
        String rankAndSalary = "";
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
        rankAndSalary = ranks[rankIdx] + " " + String.format("%8.2f", salary);
        return rankAndSalary;
    }
}
