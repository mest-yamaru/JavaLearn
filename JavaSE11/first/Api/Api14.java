import java.util.HashMap;
import java.util.Map;

public class Api14 {
    public static void main(String[] args) {
        Map<Integer, Api14Item> map = new HashMap<Integer, Api14Item>();
        map.put(1, new Api14Item(1, "A"));
        map.put(2, new Api14Item(2, "B"));
        map.put(3, new Api14Item(3, "C"));
        map.put(1, new Api14Item(1, "A"));
        map.put(null, new Api14Item(0, "default"));

        System.out.println(map.size());
    }
}
