package Chapter11.Interfaces;

public class Mouse implements Preyable{

    
    //...skip all data fields, getters and setters, constructors...

    @Override
    public void flee() {
        System.out.println("Mouse runs away.");
        
    }
}
