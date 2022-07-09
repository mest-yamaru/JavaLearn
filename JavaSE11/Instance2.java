public class Instance2 {
    public static void main(String[] args) {
        Item2 a = new Item2();
        Item2 b = new Item2();
        a.name = "apple";
        b.price = 100;
        a.price = 200;
        b.name = "banana";
        a = b;
        a.printInfo();
    }
}
