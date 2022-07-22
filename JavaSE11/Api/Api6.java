import java.util.ArrayList;

public class Api6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("A");
        list.add(10);
        list.add('B');
        for (Object obj : list) {
            System.out.print(obj);
        }
    }
}
