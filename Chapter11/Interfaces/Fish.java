package Chapter11.Interfaces;

public class Fish extends Animal implements Edible, Preyable, Predatorable {
    // data fields
    //private String name;
    //private String type;
    //...
    @Override
    public void howToEat() {
        System.out.println("Clean it and grill it.");        
    }
    @Override
    public void flee() {
        System.out.println("Fish swims away.");
        
    }
    @Override
    public void hunt() {
        System.out.println("Fish eats smaller fish.");
        
    }
    
}
