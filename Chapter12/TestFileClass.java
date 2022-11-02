package Chapter12;
import java.io.*;
import java.util.Date;
public class TestFileClass {
    public static void main(String[] args) {
        File f = new File("Chapter12/us-flag.gif");
        System.out.println("Does it exist? " + f.exists());
        System.out.println("The file has " + f.length() + " bytes");
        System.out.println("Can it be read? " + f.canRead());
        System.out.println("Can it be written? " + f.canWrite());
        System.out.println("Is it a directory: " + f.isDirectory());
        System.out.println("Is it a file? " + f.isFile());
        System.out.println("Is it hidden? " + f.isHidden());
        System.out.println("Absolute path is " + f.getAbsolutePath());
        Date lastModified  = new Date(f.lastModified());
        System.out.println("Last modified on " + lastModified);
    }
}
