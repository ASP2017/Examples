package observerexample2;

public class AliExp {
    public static void main(String [] args){
        Item item1 = new Item("item1", 99.99F);
        Item item2 = new Item("item2", 19.00F);
        Item item3 = new Item("item3", 29.79F);

        Subscriberer s1 = new Subscriberer("Ässa");
        Subscriberer s2 = new Subscriberer("Ron");
        Subscriberer s3 = new Subscriberer("Kob");

        item1.subsribe(s1);
        item1.subsribe(s2);

        item2.subsribe(s2);
        item2.subsribe(s3);

        item1.setPrise(11.11F);
        item2.setPrise(22.12F);
    }
}
