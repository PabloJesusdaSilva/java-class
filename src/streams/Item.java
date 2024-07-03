package streams;

public class Item {

    String name;
    boolean critical;
    boolean lowStock;

    public Item (String name, boolean critical, boolean lowStock){
        this.name = name;
        this.lowStock = lowStock;
        this.critical = critical;
    }
}
