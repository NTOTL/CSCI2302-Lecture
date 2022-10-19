package Chapter10;
import java.lang.*;
public class TestInteger {
    public static void main(String[] args) {
        Integer myInt = 3;
        int i = myInt;
        System.out.println("The value of the Integer myInt is " + myInt.intValue());
        System.out.println("The byte value of the Integer myInt is " + myInt.byteValue());
        System.out.println("The float value of the Integer myInt is " + myInt.floatValue());
        System.out.println("The max value of Integer is " + Integer.MAX_VALUE);
    }
}
