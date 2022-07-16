public class Api7Item {
    private String name;
    private int price;
    public Api7Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Api7Item) {
            Api7Item tmp = (Api7Item) obj;
            if (tmp.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }
}
