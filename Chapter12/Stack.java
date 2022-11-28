package Chapter12;
import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public Object pop(){
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(list.size() - 1);
    }


}
