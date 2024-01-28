package observerexample2;


import java.util.ArrayList;
import java.util.List;

public class Item {
    private float prise;
    private String itemName;


    public Item( String name,  float prise) {
        this.prise = prise;
        this.itemName = name;
    }

    public float getPrise() {
        return prise;
    }

    public void setPrise(float prise) {
        this.prise = prise;
        notifySubs(itemName, prise);
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    private List<Subscriberer> subs = new ArrayList<>();

    @Override
    public String toString() {
        return "Item{" +
                "prise=" + prise +
                ", itemName='" + itemName + '\'' +
                ", subs=" + subs +
                '}';
    }

    public void subsribe(Subscriberer sub){
        subs.add(sub);
    }

    public void unsubsribe(Subscriberer sub){
        subs.remove(sub);
    }

    public void notifySubs(String itemName, float prise){
        for( Subscriberer sub: subs){
            sub.update(itemName, prise);
        }
    }
}
