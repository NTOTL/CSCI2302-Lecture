package Chapter11.ArrayList;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        // ArrayList<String> cityList = new ArrayList<String>();

        System.out.println("The size of the list is " + cityList.size());

        cityList.add("Austin");
        System.out.println("The size of the list is " + cityList.size());

        cityList.add("Nacdogches");
        System.out.println("The size of the list is " + cityList.size());

        cityList.add(1, "Dallas");
        System.out.println("The size of the list is " + cityList.size());

        cityList.add("Paris");
        System.out.println("The size of the list is " + cityList.size());

        cityList.add("Tyler");
        System.out.println("The size of the list is " + cityList.size());

        cityList.add("Lubbock");
        System.out.println("The size of the list is " + cityList.size());

        System.out.println(cityList.toString());

        cityList.remove("Lubbock");
        System.out.println(cityList.toString());
    }
}
