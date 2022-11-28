package Chapter13;

import java.util.Date;

public class TestHouse{
    public static void main(String[] args) throws CloneNotSupportedException {
        House oldHouse = new House(1, 2500);
        House newHouse = (House)oldHouse.clone(); // this is a shadow copy
        

        System.out.println("House 1: " + oldHouse);
        System.out.println("House 2: "+ newHouse); 
        System.out.println(); 

        oldHouse.getWhenBuilt().setTime(300000);

        System.out.println("House 1: " + oldHouse);
        System.out.println("House 2: "+ newHouse); 
        System.out.println();

        House copyHouse = newHouse.deepCopy();
        newHouse.getWhenBuilt().setTime(1000000000);

        System.out.println("House 1: " + oldHouse);
        System.out.println("House 2: "+ newHouse);
        System.out.println("House 3:" + copyHouse);
        
    }
}
