package Chapter11.Interfaces;

public class Apple implements Edible {
    private String type;
    private String name;
    @Override
    public void howToEat() {
        System.out.println("Wash it, peel it, and eat it.");
        
    }
}
