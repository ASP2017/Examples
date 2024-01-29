package observerexample2;


import java.util.ArrayList;
import java.util.List;

public class Subscriberer {

    private String userName;
    List<Item> items = new ArrayList<>();

//    add some more changes
//    do else tag v1.1
//    add feature 1
//    constructor
    public Subscriberer(String userName) {
        this.userName = userName;
    }

    public void update(String itemName, float prise) {
        System.out.println(userName +"  "+ itemName + " price had updated to " + prise);
    }

    public boolean addItemToWatch(Item item){
        return items.add(item);
    }

    public boolean removeItemToWatch(Item item){
        return  items.remove(item);
    }
}
